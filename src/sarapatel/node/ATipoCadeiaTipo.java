/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ATipoCadeiaTipo extends PTipo
{
    private TTipoCadeia _tipoCadeia_;

    public ATipoCadeiaTipo()
    {
        // Constructor
    }

    public ATipoCadeiaTipo(
        @SuppressWarnings("hiding") TTipoCadeia _tipoCadeia_)
    {
        // Constructor
        setTipoCadeia(_tipoCadeia_);

    }

    @Override
    public Object clone()
    {
        return new ATipoCadeiaTipo(
            cloneNode(this._tipoCadeia_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATipoCadeiaTipo(this);
    }

    public TTipoCadeia getTipoCadeia()
    {
        return this._tipoCadeia_;
    }

    public void setTipoCadeia(TTipoCadeia node)
    {
        if(this._tipoCadeia_ != null)
        {
            this._tipoCadeia_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoCadeia_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoCadeia_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoCadeia_ == child)
        {
            this._tipoCadeia_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoCadeia_ == oldChild)
        {
            setTipoCadeia((TTipoCadeia) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
