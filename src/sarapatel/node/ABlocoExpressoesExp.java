/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoExpressoesExp extends PExp
{
    private final LinkedList<PProdDeclConst> _listaDeclConst_ = new LinkedList<PProdDeclConst>();
    private PExp _exp_;

    public ABlocoExpressoesExp()
    {
        // Constructor
    }

    public ABlocoExpressoesExp(
        @SuppressWarnings("hiding") List<?> _listaDeclConst_,
        @SuppressWarnings("hiding") PExp _exp_)
    {
        // Constructor
        setListaDeclConst(_listaDeclConst_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoExpressoesExp(
            cloneList(this._listaDeclConst_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoExpressoesExp(this);
    }

    public LinkedList<PProdDeclConst> getListaDeclConst()
    {
        return this._listaDeclConst_;
    }

    public void setListaDeclConst(List<?> list)
    {
        for(PProdDeclConst e : this._listaDeclConst_)
        {
            e.parent(null);
        }
        this._listaDeclConst_.clear();

        for(Object obj_e : list)
        {
            PProdDeclConst e = (PProdDeclConst) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._listaDeclConst_.add(e);
        }
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._listaDeclConst_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._listaDeclConst_.remove(child))
        {
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PProdDeclConst> i = this._listaDeclConst_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PProdDeclConst) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}