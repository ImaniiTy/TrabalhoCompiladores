/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class APrio4Prio3 extends PPrio3
{
    private PPrio4 _prio4_;

    public APrio4Prio3()
    {
        // Constructor
    }

    public APrio4Prio3(
        @SuppressWarnings("hiding") PPrio4 _prio4_)
    {
        // Constructor
        setPrio4(_prio4_);

    }

    @Override
    public Object clone()
    {
        return new APrio4Prio3(
            cloneNode(this._prio4_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrio4Prio3(this);
    }

    public PPrio4 getPrio4()
    {
        return this._prio4_;
    }

    public void setPrio4(PPrio4 node)
    {
        if(this._prio4_ != null)
        {
            this._prio4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prio4_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prio4_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prio4_ == child)
        {
            this._prio4_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prio4_ == oldChild)
        {
            setPrio4((PPrio4) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
