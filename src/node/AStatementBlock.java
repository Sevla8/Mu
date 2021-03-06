/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AStatementBlock extends PStatementBlock
{
    private TStatement _statement_;
    private TColumn _column_;
    private PStatementInstructionList _statementInstructionList_;

    public AStatementBlock()
    {
        // Constructor
    }

    public AStatementBlock(
        @SuppressWarnings("hiding") TStatement _statement_,
        @SuppressWarnings("hiding") TColumn _column_,
        @SuppressWarnings("hiding") PStatementInstructionList _statementInstructionList_)
    {
        // Constructor
        setStatement(_statement_);

        setColumn(_column_);

        setStatementInstructionList(_statementInstructionList_);

    }

    @Override
    public Object clone()
    {
        return new AStatementBlock(
            cloneNode(this._statement_),
            cloneNode(this._column_),
            cloneNode(this._statementInstructionList_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatementBlock(this);
    }

    public TStatement getStatement()
    {
        return this._statement_;
    }

    public void setStatement(TStatement node)
    {
        if(this._statement_ != null)
        {
            this._statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statement_ = node;
    }

    public TColumn getColumn()
    {
        return this._column_;
    }

    public void setColumn(TColumn node)
    {
        if(this._column_ != null)
        {
            this._column_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._column_ = node;
    }

    public PStatementInstructionList getStatementInstructionList()
    {
        return this._statementInstructionList_;
    }

    public void setStatementInstructionList(PStatementInstructionList node)
    {
        if(this._statementInstructionList_ != null)
        {
            this._statementInstructionList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statementInstructionList_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._statement_)
            + toString(this._column_)
            + toString(this._statementInstructionList_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._statement_ == child)
        {
            this._statement_ = null;
            return;
        }

        if(this._column_ == child)
        {
            this._column_ = null;
            return;
        }

        if(this._statementInstructionList_ == child)
        {
            this._statementInstructionList_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._statement_ == oldChild)
        {
            setStatement((TStatement) newChild);
            return;
        }

        if(this._column_ == oldChild)
        {
            setColumn((TColumn) newChild);
            return;
        }

        if(this._statementInstructionList_ == oldChild)
        {
            setStatementInstructionList((PStatementInstructionList) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
