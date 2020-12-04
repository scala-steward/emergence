package com.firstbird.emergence.core.vcs.model

import io.circe.Codec
import io.circe.generic.extras.semiauto.deriveUnwrappedCodec

final case class PullRequestNumber(value: Int) extends AnyVal {
  override def toString: String = value.toString
}

object PullRequestNumber {
  implicit val pullRequestNumberCodec: Codec[PullRequestNumber] = deriveUnwrappedCodec
}