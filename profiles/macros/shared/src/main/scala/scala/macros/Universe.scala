package scala.macros

private[scala] trait Universe extends scala.meta.Universe with Expansions {
  private[scala] type Abstracts <: TreeAbstracts with ExpansionAbstracts
  private[scala] def abstracts: Abstracts
}
