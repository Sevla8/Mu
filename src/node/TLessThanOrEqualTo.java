/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TLessThanOrEqualTo extends Token
{
    public TLessThanOrEqualTo(String text)
    {
        setText(text);
    }

    public TLessThanOrEqualTo(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLessThanOrEqualTo(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLessThanOrEqualTo(this);
    }
}
