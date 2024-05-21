package cpu.common.const

import chisel3._

object Const extends ConstDecode with ConstWidth with ConstEx with Instructions with ConstWidthAxi with ConstWidthTlb {
  val PC_INIT_ADDR     = "hbfc00000"
  val PC_INIT_ADDR_SUB = "hbfbffffc"

  val EX_INIT_ADDR       = "hbfc00380"
  val EX_TLB_REFILL_ADDR = "hbfc00200"

  val WB_EN = "b1111".U
  val WB_NO = "b0000".U
}
