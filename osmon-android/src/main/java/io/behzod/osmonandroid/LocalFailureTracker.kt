package io.behzod.osmonandroid

object LocalFailureTracker : FailureTracker {

  private val failures = object : ThreadLocal<MutableList<Throwable>>() {
    override fun initialValue(): MutableList<Throwable> {
      return mutableListOf()
    }
  }

  private val trackerMode = object : ThreadLocal<FailureTrackerMode>() {
    override fun initialValue(): FailureTrackerMode {
      return FailureTrackerMode.Hard
    }
  }

  override fun getModeOfTracker(): FailureTrackerMode {
    return trackerMode.get() ?: FailureTrackerMode.Hard
  }

  override fun updateModeOfTracker(mode: FailureTrackerMode) {
    trackerMode.set(mode)
  }

  override fun failures(): List<Throwable> {
    return failures.get()?.toList() ?: emptyList()
  }

  override fun reportFailure(throwable: Throwable) {
    failures.get()?.add(throwable)
  }

  override fun reset() {
    failures.get()?.clear()
  }
}

fun FailureTracker.getOrFailed(throwable: Throwable) {
  when (getModeOfTracker()) {
    FailureTrackerMode.Soft -> {
      reportFailure(throwable)
    }
    FailureTrackerMode.Hard -> {
      throw throwable
    }
  }
}
