/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class APrio6Prio5 extends PPrio5
{
    private PPrio6 _prio6_;

    public APrio6Prio5()
    {
        // Constructor
    }

    public APrio6Prio5(
        @SuppressWarnings("hiding") PPrio6 _prio6_)
    {
        // Constructor
        setPrio6(_prio6_);

    }

    @Override
    public Object clone()
    {
        return new APrio6Prio5(
            cloneNode(this._prio6_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPrio6Prio5(this);
    }

    public PPrio6 getPrio6()
    {
        return this._prio6_;
    }

    public void setPrio6(PPrio6 node)
    {
        if(this._prio6_ != null)
        {
            this._prio6_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prio6_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prio6_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._prio6_ == child)
        {
            this._prio6_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._prio6_ == oldChild)
        {
            setPrio6((PPrio6) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
