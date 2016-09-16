package models
/**
  * Helper for pagination.
  */
case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long) {
  val pageSize = items.size
  lazy val prev = Option(page - 1).filter(_ >= 0)
  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
}



/**
  * Manages the high and low bound calculation for a paginated result layout.
  * Initially done to reduce copied/pasted code inside templates.
  */
object PaginationBoundCalc {


  val bound = 5

  def lowBound(pagination: Page[Candidate]) = {
    val lowBound = (pagination.page - (bound / 2)).max(0)
    val maxBound = pagination.total.toInt / pagination.pageSize
    if (lowBound + bound > maxBound) {
      (lowBound - (lowBound + bound - maxBound) + 1).max(0)
    }
    else {
      lowBound
    }
  }

  def highBound(pagination: Page[Candidate]) = {
    val highBound = (pagination.page + (bound / 2)).min(pagination.total.toInt / pagination.pageSize)
    if (highBound - bound < 0) {
      (highBound - (highBound - bound) - 1).min(pagination.total.toInt / pagination.pageSize)
    }
    else {
      highBound
    }

  }
}