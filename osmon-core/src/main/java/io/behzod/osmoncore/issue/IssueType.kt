package io.behzod.osmoncore.issue

/**
 * Represents the severity of an issue
 */
sealed interface IssueType {
  /**
   * Indicates a warning-level issue that requires attention, but is not critical
   */
  object Warning : IssueType

  /**
   * Indicates a critical-level issue that requires immediate attention.
   */
  object Critical : IssueType
}
