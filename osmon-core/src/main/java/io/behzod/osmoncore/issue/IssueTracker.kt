package io.behzod.osmoncore.issue

import io.behzod.osmoncore.issue.LocalizedIssueMonitor.clearIssues
import io.behzod.osmoncore.issue.LocalizedIssueMonitor.detectIssue
import io.behzod.osmoncore.issue.LocalizedIssueMonitor.issues
import io.behzod.osmoncore.issue.LocalizedIssueMonitor.reportIssue
import io.behzod.osmoncore.issue.LocalizedIssueMonitor.updateIssueType

/**
 * The [IssueTracker] provides a set of functions to track and manages issues.
 */
interface IssueTracker {
  /**
   * The [detectIssue] function  returns the current type of issue being tracked within the localized context.
   */
  fun detectIssue(): IssueType

  /**
   * The [updateIssueType] function updates the current issue type with the provided value.
   */
  fun updateIssueType(type: IssueType)

  /**
   * The [issues] function returns a list of all the issues that have been reported.
   */
  fun issues(): List<Throwable>

  /**
   * The [reportIssue] function adds a new issue to the list.
   */
  fun reportIssue(issue: Throwable)

  /**
   * The [clearIssues] function clears the list of issues.
   */
  fun clearIssues()
}
