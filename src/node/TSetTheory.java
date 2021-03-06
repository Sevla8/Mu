/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TSetTheory extends Token
{
    public TSetTheory()
    {
        super.setText("set theory");
    }

    public TSetTheory(int line, int pos)
    {
        super.setText("set theory");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSetTheory(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSetTheory(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSetTheory text.");
    }
}
