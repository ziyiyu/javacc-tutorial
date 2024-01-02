package com.github.gambo.javacc.jjtree;
public class ASTMyOtherID extends SimpleNode {
  private String name;
  public ASTMyOtherID(int id) {
    super(id);
  }

  public ASTMyOtherID(Eg2 p, int id) {
    super(p, id);
  }

  /**
   * Set the name.
   * @param n the name
   */
  public void setName(String n) {
    name = n;
  }


  public String getName() {
    return name;
  }

  /** Accept the visitor. **/
  public Object jjtAccept(Eg2Visitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
