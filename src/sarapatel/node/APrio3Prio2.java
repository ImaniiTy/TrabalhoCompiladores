/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class APrio3Prio2 extends PPrio2
{
    private PPrio3 _prio3_;

    public APrio3Prio2()
    {
        // Constructor
    }

    public APrio3Prio2(
        @SuppressWarnings("hiding") PPrio3 _prio3_)
    {
        // Constructor
        setPrio3(_prio3_);

    }

    @Override
    public Object clone()
    {
        return new APrio3Prio2(
            cloneNode(this._prio3_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrio3Prio2(this);
    }

    public PPrio3 getPrio3()
    {
        return this._prio3_;
    }

    public void setPrio3(PPrio3 node)
    {
        if(this._prio3_ != null)
        {
            this._prio3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prio3_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prio3_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prio3_ == child)
        {
            this._prio3_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prio3_ == oldChild)
        {
            setPrio3((PPrio3) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
