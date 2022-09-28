/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ASomaPrio4 extends PPrio4
{
    private PPrio4 _prio4_;
    private TSoma _soma_;
    private PPrio5 _prio5_;

    public ASomaPrio4()
    {
        // Constructor
    }

    public ASomaPrio4(
        @SuppressWarnings("hiding") PPrio4 _prio4_,
        @SuppressWarnings("hiding") TSoma _soma_,
        @SuppressWarnings("hiding") PPrio5 _prio5_)
    {
        // Constructor
        setPrio4(_prio4_);

        setSoma(_soma_);

        setPrio5(_prio5_);

    }

    @Override
    public Object clone()
    {
        return new ASomaPrio4(
            cloneNode(this._prio4_),
            cloneNode(this._soma_),
            cloneNode(this._prio5_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASomaPrio4(this);
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

    public TSoma getSoma()
    {
        return this._soma_;
    }

    public void setSoma(TSoma node)
    {
        if(this._soma_ != null)
        {
            this._soma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._soma_ = node;
    }

    public PPrio5 getPrio5()
    {
        return this._prio5_;
    }

    public void setPrio5(PPrio5 node)
    {
        if(this._prio5_ != null)
        {
            this._prio5_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prio5_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._prio4_)
            + toString(this._soma_)
            + toString(this._prio5_);
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

        if(this._soma_ == child)
        {
            this._soma_ = null;
            return;
        }

        if(this._prio5_ == child)
        {
            this._prio5_ = null;
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

        if(this._soma_ == oldChild)
        {
            setSoma((TSoma) newChild);
            return;
        }

        if(this._prio5_ == oldChild)
        {
            setPrio5((PPrio5) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
