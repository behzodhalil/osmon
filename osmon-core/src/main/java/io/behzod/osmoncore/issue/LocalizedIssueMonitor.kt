package io.behzod.osmoncore.issue

/**
 * THe [LocalizedIssueMonitor] provides a thread-safe way to track
 * and manage issues within a localized context.
 */
object LocalizedIssueMonitor : IssueTracker {

  /**
   * The [issues] property is a [ThreadLocal] variable that holds a list of [Throwable] objects,
   * which represent issues or failures that have been detected.
   */
  private val issues = object : ThreadLocal<MutableList<Throwable>>() {
    override fun initialValue(): MutableList<Throwable> {
      return mutableListOf()
    }
  }

  /**
   * The [issueType] property represents the type of issue being tracked.
   */
  private val issueType = object : ThreadLocal<IssueType>() {
    override fun initialValue(): IssueType {
      return IssueType.Critical
    }
  }

  /**
   * The [detectIssue] function  returns the current type of issue being tracked within the localized context.
   */
  override fun detectIssue(): IssueType {
    return issueType.get() ?: IssueType.Critical
  }

  /**
   * The [updateIssueType] function updates the current issue type with the provided value.
   */
  override fun updateIssueType(type: IssueType) {
    issueType.set(type)
  }

  /**
   * The [issues] function returns a list of all the issues that have been reported.
   */
  override fun issues(): List<Throwable> {
    return issues.get()?.toList() ?: emptyList()
  }

  /**
   * The [reportIssue] function adds a new issue to the list.
   */
  override fun reportIssue(issue: Throwable) {
    issues.get()?.add(issue)
  }

  /**
   * The [clearIssues] function clears the list of issues.
   */
  override fun clearIssues() {
    issues.get()?.clear()
  }
}

/**
 * The [requireDetection] function is a utility function provided by the [LocalizedIssueMonitor] object.
 */
fun LocalizedIssueMonitor.requireDetection(issue: Throwable) {
  when (detectIssue()) {
    is IssueType.Warning -> {
      reportIssue(issue)
    }
    is IssueType.Critical -> {
      throw issue
    }
  }
}
