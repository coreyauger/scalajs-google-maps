package io.surfkit.flux

import scala.scalajs.js
import js.{Date, UndefOr}
import js.annotation.JSName
import js.JSConverters._

trait BootstrapDatepicker extends js.Object {
  def datepicker(options:String):String = js.native

  /**
   * Underlying API to send commands to datepicker. Don't use this; use the methods in
   * DatepickerCommands instead.
   */
  @JSName("datepicker")
  def datepickerInternal(cmd:String, params:js.Any*):Any = js.native
}

/**
 * Strongly-typed versions of the commands defined on BootstrapDatepicker.
 */
class DatepickerCommands(dp:BootstrapDatepicker) {
  def command(cmd:String, params:js.Any*) = dp.datepickerInternal(cmd, params:_*)

  def clearDates() = command("clearDates")

  def getDate() = command("getDate").asInstanceOf[Date]

  def getDates() = command("getDates").asInstanceOf[js.Array[Date]]

  def getUTCDate() = command("getUTCDate").asInstanceOf[Date]

  def getUTCDates() = command("getUTCDates").asInstanceOf[js.Array[Date]]

  def hide() = command("hide")

  def remove() = command("remove")

  def setDate(date:Date) = command("setDate", date)

  def setDates(dates:Seq[Date]) = command("setDates", dates.toJSArray)

  def setDaysOfWeekDisabled(v:Boolean) = command("setDaysOfWeekDisabled", v)

  def setEndDate(date:Date) = command("setEndDate", date)

  def setStartDate(date:Date) = command("setStartDate", date)

  def setUTCDate(date:Date) = command("setUTCDate", date)

  def setUTCDates(dates:Seq[Date]) = command("setUTCDates", dates.toJSArray)

  def show() = command("show")

  def update(date:String) = command("update", date)
  def update(date:Date) = command("update", date)
}
