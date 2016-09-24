package com.github.mauricio.async.db.util

object TestExecutionContext {
  implicit object instance extends scala.concurrent.ExecutionContext {
    override def execute(runnable: Runnable) =
      runnable.run()
    override def reportFailure(cause: Throwable) =
      cause.printStackTrace()
  }
}
