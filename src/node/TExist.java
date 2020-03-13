/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TExist extends Token
{
    public TExist()
    {
        super.setText("∃");
    }

    public TExist(int line, int pos)
    {
        super.setText("∃");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TExist(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTExist(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TExist text.");
    }
}
