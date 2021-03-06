/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AStatementInstructionList extends PStatementInstructionList
{
    private PStatementInstruction _statementInstruction_;
    private final LinkedList<PAdditionalStatementInstruction> _additionalStatementInstruction_ = new LinkedList<PAdditionalStatementInstruction>();
    private TSemicolon _semicolon_;

    public AStatementInstructionList()
    {
        // Constructor
    }

    public AStatementInstructionList(
        @SuppressWarnings("hiding") PStatementInstruction _statementInstruction_,
        @SuppressWarnings("hiding") List<?> _additionalStatementInstruction_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setStatementInstruction(_statementInstruction_);

        setAdditionalStatementInstruction(_additionalStatementInstruction_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AStatementInstructionList(
            cloneNode(this._statementInstruction_),
            cloneList(this._additionalStatementInstruction_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStatementInstructionList(this);
    }

    public PStatementInstruction getStatementInstruction()
    {
        return this._statementInstruction_;
    }

    public void setStatementInstruction(PStatementInstruction node)
    {
        if(this._statementInstruction_ != null)
        {
            this._statementInstruction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statementInstruction_ = node;
    }

    public LinkedList<PAdditionalStatementInstruction> getAdditionalStatementInstruction()
    {
        return this._additionalStatementInstruction_;
    }

    public void setAdditionalStatementInstruction(List<?> list)
    {
        for(PAdditionalStatementInstruction e : this._additionalStatementInstruction_)
        {
            e.parent(null);
        }
        this._additionalStatementInstruction_.clear();

        for(Object obj_e : list)
        {
            PAdditionalStatementInstruction e = (PAdditionalStatementInstruction) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._additionalStatementInstruction_.add(e);
        }
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._statementInstruction_)
            + toString(this._additionalStatementInstruction_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._statementInstruction_ == child)
        {
            this._statementInstruction_ = null;
            return;
        }

        if(this._additionalStatementInstruction_.remove(child))
        {
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._statementInstruction_ == oldChild)
        {
            setStatementInstruction((PStatementInstruction) newChild);
            return;
        }

        for(ListIterator<PAdditionalStatementInstruction> i = this._additionalStatementInstruction_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAdditionalStatementInstruction) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
