/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class AIdAtribuicaoIdAtribuicao extends PIdAtribuicao
{
    private TId _id_;
    private TAtribuicao _atribuicao_;
    private PPrio0 _prio0_;

    public AIdAtribuicaoIdAtribuicao()
    {
        // Constructor
    }

    public AIdAtribuicaoIdAtribuicao(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TAtribuicao _atribuicao_,
        @SuppressWarnings("hiding") PPrio0 _prio0_)
    {
        // Constructor
        setId(_id_);

        setAtribuicao(_atribuicao_);

        setPrio0(_prio0_);

    }

    @Override
    public Object clone()
    {
        return new AIdAtribuicaoIdAtribuicao(
            cloneNode(this._id_),
            cloneNode(this._atribuicao_),
            cloneNode(this._prio0_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdAtribuicaoIdAtribuicao(this);
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TAtribuicao getAtribuicao()
    {
        return this._atribuicao_;
    }

    public void setAtribuicao(TAtribuicao node)
    {
        if(this._atribuicao_ != null)
        {
            this._atribuicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._atribuicao_ = node;
    }

    public PPrio0 getPrio0()
    {
        return this._prio0_;
    }

    public void setPrio0(PPrio0 node)
    {
        if(this._prio0_ != null)
        {
            this._prio0_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._prio0_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._atribuicao_)
            + toString(this._prio0_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._atribuicao_ == child)
        {
            this._atribuicao_ = null;
            return;
        }

        if(this._prio0_ == child)
        {
            this._prio0_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._atribuicao_ == oldChild)
        {
            setAtribuicao((TAtribuicao) newChild);
            return;
        }

        if(this._prio0_ == oldChild)
        {
            setPrio0((PPrio0) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}