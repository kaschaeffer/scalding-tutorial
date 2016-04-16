package com.github.kaschaeffer

import com.twitter.scalding.Args
import com.twitter.scalding.Job
import com.twitter.scalding.TextLine

/**
 * Simplest possible scalding job.
 *
 * Just copies `input` to `output`.
 */
class Tutorial(args: Args) extends Job(args) {
  val input = TextLine(args("input"))
  val output = TextLine(args("output"))

  input.read.write(output)
}
