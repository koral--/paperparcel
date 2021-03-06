/*
 * Copyright (C) 2016 Bradley Campbell.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nz.bradcampbell.kotlinexample

import paperparcel.PaperParcelable
import paperparcel.PaperParcel
import java.util.Date

@PaperParcel data class State(
    val count: Int,
    val modificationDate: Date
) : PaperParcelable {
  @Transient val somethingToExclude = 10000L

  companion object {
    @JvmField val CREATOR = PaperParcelState.CREATOR
  }
}
