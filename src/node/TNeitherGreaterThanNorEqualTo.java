/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TNeitherGreaterThanNorEqualTo extends Token
{
    public TNeitherGreaterThanNorEqualTo(String text)
    {
        setText(text);
    }

    public TNeitherGreaterThanNorEqualTo(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNeitherGreaterThanNorEqualTo(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNeitherGreaterThanNorEqualTo(this);
    }
}
