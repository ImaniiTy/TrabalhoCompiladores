/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ATernarioTernarioExp extends PTernarioExp
{
    private PTernario _ternario_;

    public ATernarioTernarioExp()
    {
        // Constructor
    }

    public ATernarioTernarioExp(
        @SuppressWarnings("hiding") PTernario _ternario_)
    {
        // Constructor
        setTernario(_ternario_);

    }

    @Override
    public Object clone()
    {
        return new ATernarioTernarioExp(
            cloneNode(this._ternario_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATernarioTernarioExp(this);
    }

    public PTernario getTernario()
    {
        return this._ternario_;
    }

    public void setTernario(PTernario node)
    {
        if(this._ternario_ != null)
        {
            this._ternario_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ternario_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ternario_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ternario_ == child)
        {
            this._ternario_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ternario_ == oldChild)
        {
            setTernario((PTernario) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}