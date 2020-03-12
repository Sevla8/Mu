/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TEmptySet extends Token
{
    public TEmptySet()
    {
        super.setText("∅");
    }

    public TEmptySet(int line, int pos)
    {
        super.setText("∅");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEmptySet(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEmptySet(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEmptySet text.");
    }
}
