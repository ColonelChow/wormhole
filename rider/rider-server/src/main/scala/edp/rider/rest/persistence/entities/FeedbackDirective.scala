/*-
 * <<
 * wormhole
 * ==
 * Copyright (C) 2016 - 2017 EDP
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * >>
 */


package edp.rider.rest.persistence.entities

import edp.rider.rest.persistence.base.{BaseEntity, BaseTable}
import slick.jdbc.MySQLProfile.api._
import slick.lifted.Tag

case class FeedbackDirective(id: Long,
                             protocolType: String,
                             umsTs: String,
                             streamId: Long,
                             directiveId: Long,
                             status: String,
                             resultDesc: String,
                             feedbackTime: String
                            ) extends BaseEntity

class FeedbackDirectiveTable(_tableTag: Tag) extends BaseTable[FeedbackDirective](_tableTag, "feedback_directive") {
  def * = (id, projectType, umsTs, streamId, directiveId, status, resultDesc, feedbackTime) <> (FeedbackDirective.tupled, FeedbackDirective.unapply)

  val projectType: Rep[String] = column[String]("protocol_type", O.Length(200, varying = true))
  val umsTs: Rep[String] = column[String]("ums_ts")
  val streamId: Rep[Long] = column[Long]("stream_id")
  val directiveId: Rep[Long] = column[Long]("directive_id")
  val status: Rep[String] = column[String]("status", O.Length(32, varying = true))
  val resultDesc: Rep[String] = column[String]("result_desc", O.Length(2000, varying = true))
  val feedbackTime: Rep[String] = column[String]("feedback_time")

}
