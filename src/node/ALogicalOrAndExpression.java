/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALogicalOrAndExpression extends PAndExpression
{
    private POrExpression _orExpression_;

    public ALogicalOrAndExpression()
    {
        // Constructor
    }

    public ALogicalOrAndExpression(
        @SuppressWarnings("hiding") POrExpression _orExpression_)
    {
        // Constructor
        setOrExpression(_orExpression_);

    }

    @Override
    public Object clone()
    {
        return new ALogicalOrAndExpression(
            cloneNode(this._orExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogicalOrAndExpression(this);
    }

    public POrExpression getOrExpression()
    {
        return this._orExpression_;
    }

    public void setOrExpression(POrExpression node)
    {
        if(this._orExpression_ != null)
        {
            this._orExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._orExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._orExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._orExpression_ == child)
        {
            this._orExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._orExpression_ == oldChild)
        {
            setOrExpression((POrExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
