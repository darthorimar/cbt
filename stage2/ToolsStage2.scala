package cbt
import java.io._
object ToolsStage2 extends Stage2Base{
  def run( _args: Stage2Args ): ExitCode = {
    val args = _args.args.dropWhile(Seq("tools") contains _)
    val lib = new Lib(_args.logger)
    val toolsTasks = new ToolsTasks(lib, args, _args)
    lib.callReflective(toolsTasks, args.lift(0), null)
  }
}
