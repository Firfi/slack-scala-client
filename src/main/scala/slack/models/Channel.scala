package slack.models

import play.api.libs.json._

case class Channel (
  id: String,
  name: String,
  created: Long,
  creator: String,
  is_archived: Boolean,
  is_member: Boolean,
  is_general: Boolean,
  num_members: Option[Int],
  members: Option[Seq[String]],
  topic: Option[ChannelValue],
  purpose: Option[ChannelValue],
  last_read: Option[String],
  latest: Option[JsValue],
  unread_count: Option[Int],
  unread_count_display: Option[Int]
)

case class ChannelValue (
  value: String,
  creator: String,
  last_set: Long
)