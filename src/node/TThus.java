/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TThus extends Token
{
    public TThus()
    {
        super.setText("thus");
    }

    public TThus(int line, int pos)
    {
        super.setText("thus");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TThus(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTThus(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TThus text.");
    }
}
