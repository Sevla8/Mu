/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class TProof extends Token
{
    public TProof()
    {
        super.setText("proof");
    }

    public TProof(int line, int pos)
    {
        super.setText("proof");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TProof(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTProof(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TProof text.");
    }
}