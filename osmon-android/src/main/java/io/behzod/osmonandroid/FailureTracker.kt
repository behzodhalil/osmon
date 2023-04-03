package io.behzod.osmonandroid

interface FailureTracker {
  fun getModeOfTracker(): FailureTrackerMode
  fun updateModeOfTracker(mode: FailureTrackerMode)
  fun failures(): List<Throwable>
  fun reportFailure(throwable: Throwable)
  fun reset()
}
