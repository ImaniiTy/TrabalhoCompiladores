/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class TDeclFuncao extends Token
{
    public TDeclFuncao()
    {
        super.setText("funcao");
    }

    public TDeclFuncao(int line, int pos)
    {
        super.setText("funcao");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDeclFuncao(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDeclFuncao(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDeclFuncao text.");
    }
}