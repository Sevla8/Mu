/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TNatural extends Token
{
    public TNatural()
    {
        super.setText("N");
    }

    public TNatural(int line, int pos)
    {
        super.setText("N");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNatural(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNatural(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNatural text.");
    }
}
