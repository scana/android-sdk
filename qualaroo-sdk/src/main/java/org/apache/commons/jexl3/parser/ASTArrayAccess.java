/* Generated By:JJTree: Do not edit this line. ASTArrayAccess.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package org.apache.commons.jexl3.parser;

public
class ASTArrayAccess extends JexlNode {
  public ASTArrayAccess(int id) {
    super(id);
  }

  public ASTArrayAccess(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=2d9af05bca4ff5afc378bb13a5d5915f (do not edit this line) */
