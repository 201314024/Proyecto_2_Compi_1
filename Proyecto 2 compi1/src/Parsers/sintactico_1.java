
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141202 (SVN rev 60)
//----------------------------------------------------

package Parsers;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141202 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class sintactico_1 extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return tabla_simbolos.class;
}

  /** Default constructor. */
  public sintactico_1() {super();}

  /** Constructor which sets the default scanner. */
  public sintactico_1(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public sintactico_1(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\004\000\002\002\003\000\002\003" +
    "\006\000\002\003\006\000\002\004\007\000\002\004\007" +
    "\000\002\004\007\000\002\004\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\004\004\006\001\002\000\004\002\000\001" +
    "\002\000\004\002\034\001\002\000\006\011\007\013\010" +
    "\001\002\000\012\005\011\006\012\012\ufffa\021\013\001" +
    "\002\000\012\005\011\006\012\014\ufffa\021\013\001\002" +
    "\000\004\015\026\001\002\000\004\015\022\001\002\000" +
    "\004\015\016\001\002\000\004\014\015\001\002\000\004" +
    "\002\uffff\001\002\000\004\010\017\001\002\000\004\016" +
    "\020\001\002\000\014\005\011\006\012\012\ufffa\014\ufffa" +
    "\021\013\001\002\000\006\012\ufffc\014\ufffc\001\002\000" +
    "\004\022\023\001\002\000\004\016\024\001\002\000\014" +
    "\005\011\006\012\012\ufffa\014\ufffa\021\013\001\002\000" +
    "\006\012\ufffb\014\ufffb\001\002\000\004\007\027\001\002" +
    "\000\004\016\030\001\002\000\014\005\011\006\012\012" +
    "\ufffa\014\ufffa\021\013\001\002\000\006\012\ufffd\014\ufffd" +
    "\001\002\000\004\012\033\001\002\000\004\002\ufffe\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\006\002\004\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\004\031" +
    "\001\001\000\004\004\013\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\020\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\004\024\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\030\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$sintactico_1$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$sintactico_1$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$sintactico_1$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



/**Metodo al que se llama autom�ticamente ante alg�n error sintactico.*/

public void syntax_error(Symbol s){
System.out.println("Error en la Linea " + (s.right+1) +" Columna " +s.left+ ". Identificador " +s.value + " no reconocido." );
}
/**Metodo al que se llama en el momento en que ya no es posible una recuperaci�n de errores.*/
public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
System.out.println("Error en la L�nea " + (s.right+1)+ " Columna "+s.left+". Identificador " + s.value + " no reconocido.");
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$sintactico_1$actions {
  private final sintactico_1 parser;

  /** Constructor */
  CUP$sintactico_1$actions(sintactico_1 parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$sintactico_1$do_action_part00000000(
    int                        CUP$sintactico_1$act_num,
    java_cup.runtime.lr_parser CUP$sintactico_1$parser,
    java.util.Stack            CUP$sintactico_1$stack,
    int                        CUP$sintactico_1$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$sintactico_1$result;

      /* select the action based on the action number */
      switch (CUP$sintactico_1$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-1)).value;
		RESULT = start_val;
              CUP$sintactico_1$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-1)), ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$sintactico_1$parser.done_parsing();
          return CUP$sintactico_1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIA ::= A 
            {
              Object RESULT =null;

              CUP$sintactico_1$result = parser.getSymbolFactory().newSymbol("INICIA",0, ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), RESULT);
            }
          return CUP$sintactico_1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // A ::= Tproy Ocorch B Ccorch 
            {
              Object RESULT =null;

              CUP$sintactico_1$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), RESULT);
            }
          return CUP$sintactico_1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // A ::= Tproy Ollave B Cllave 
            {
              Object RESULT =null;

              CUP$sintactico_1$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-3)), ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), RESULT);
            }
          return CUP$sintactico_1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // B ::= Tpath tpunts tlpath tpuntycom B 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).value;
		proyecto.pkg2.compi1.Editor.addpath(a.toString());
              CUP$sintactico_1$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-4)), ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), RESULT);
            }
          return CUP$sintactico_1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // B ::= tnomb tpunts tcnombre tpuntycom B 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).value;
		proyecto.pkg2.compi1.Editor.addnom(b.toString());
              CUP$sintactico_1$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-4)), ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), RESULT);
            }
          return CUP$sintactico_1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // B ::= Tfecha tpunts tlfecha tpuntycom B 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-2)).value;
		proyecto.pkg2.compi1.Editor.fecha=c.toString();
              CUP$sintactico_1$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.elementAt(CUP$sintactico_1$top-4)), ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), RESULT);
            }
          return CUP$sintactico_1$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // B ::= 
            {
              Object RESULT =null;
		//no pos nada
              CUP$sintactico_1$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), ((java_cup.runtime.Symbol)CUP$sintactico_1$stack.peek()), RESULT);
            }
          return CUP$sintactico_1$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$sintactico_1$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$sintactico_1$do_action(
    int                        CUP$sintactico_1$act_num,
    java_cup.runtime.lr_parser CUP$sintactico_1$parser,
    java.util.Stack            CUP$sintactico_1$stack,
    int                        CUP$sintactico_1$top)
    throws java.lang.Exception
    {
              return CUP$sintactico_1$do_action_part00000000(
                               CUP$sintactico_1$act_num,
                               CUP$sintactico_1$parser,
                               CUP$sintactico_1$stack,
                               CUP$sintactico_1$top);
    }
}

}
