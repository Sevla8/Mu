/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TNeitherLessThanNorEqualTo extends Token
{
    public TNeitherLessThanNorEqualTo(String text)
    {
        setText(text);
    }

    public TNeitherLessThanNorEqualTo(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNeitherLessThanNorEqualTo(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNeitherLessThanNorEqualTo(this);
    }
}
