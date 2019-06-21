package com.craftinginterpreters.lox;

// Creates an unambiguous, if ugly, string representation of AST nodes.
class AstPrinter implements Expr.Visitor<String> {                     
  String print(Expr expr) {                                            
    return expr.accept(this);                                          
  }                                                                    
} 
