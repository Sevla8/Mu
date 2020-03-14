/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import java.util.*;
import analysis.*;

@SuppressWarnings("nls")
public final class AQuestionInstructionList extends PQuestionInstructionList
{
    private PQuestionInstruction _questionInstruction_;
    private final LinkedList<PAdditionalQuestionInstruction> _additionalQuestionInstruction_ = new LinkedList<PAdditionalQuestionInstruction>();
    private TSemicolon _semicolon_;

    public AQuestionInstructionList()
    {
        // Constructor
    }

    public AQuestionInstructionList(
        @SuppressWarnings("hiding") PQuestionInstruction _questionInstruction_,
        @SuppressWarnings("hiding") List<?> _additionalQuestionInstruction_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setQuestionInstruction(_questionInstruction_);

        setAdditionalQuestionInstruction(_additionalQuestionInstruction_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AQuestionInstructionList(
            cloneNode(this._questionInstruction_),
            cloneList(this._additionalQuestionInstruction_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAQuestionInstructionList(this);
    }

    public PQuestionInstruction getQuestionInstruction()
    {
        return this._questionInstruction_;
    }

    public void setQuestionInstruction(PQuestionInstruction node)
    {
        if(this._questionInstruction_ != null)
        {
            this._questionInstruction_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._questionInstruction_ = node;
    }

    public LinkedList<PAdditionalQuestionInstruction> getAdditionalQuestionInstruction()
    {
        return this._additionalQuestionInstruction_;
    }

    public void setAdditionalQuestionInstruction(List<?> list)
    {
        for(PAdditionalQuestionInstruction e : this._additionalQuestionInstruction_)
        {
            e.parent(null);
        }
        this._additionalQuestionInstruction_.clear();

        for(Object obj_e : list)
        {
            PAdditionalQuestionInstruction e = (PAdditionalQuestionInstruction) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._additionalQuestionInstruction_.add(e);
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
            + toString(this._questionInstruction_)
            + toString(this._additionalQuestionInstruction_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._questionInstruction_ == child)
        {
            this._questionInstruction_ = null;
            return;
        }

        if(this._additionalQuestionInstruction_.remove(child))
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
        if(this._questionInstruction_ == oldChild)
        {
            setQuestionInstruction((PQuestionInstruction) newChild);
            return;
        }

        for(ListIterator<PAdditionalQuestionInstruction> i = this._additionalQuestionInstruction_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PAdditionalQuestionInstruction) newChild);
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