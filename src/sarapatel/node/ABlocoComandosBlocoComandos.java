/* This file was generated by SableCC (http://www.sablecc.org/). */

package sarapatel.node;

import java.util.*;
import sarapatel.analysis.*;

@SuppressWarnings("nls")
public final class ABlocoComandosBlocoComandos extends PBlocoComandos
{
    private TInicioBloco _inicioBloco_;
    private final LinkedList<PProgramaEsq> _programaEsq_ = new LinkedList<PProgramaEsq>();
    private final LinkedList<PComando> _comando_ = new LinkedList<PComando>();
    private TFimBloco _fimBloco_;

    public ABlocoComandosBlocoComandos()
    {
        // Constructor
    }

    public ABlocoComandosBlocoComandos(
        @SuppressWarnings("hiding") TInicioBloco _inicioBloco_,
        @SuppressWarnings("hiding") List<?> _programaEsq_,
        @SuppressWarnings("hiding") List<?> _comando_,
        @SuppressWarnings("hiding") TFimBloco _fimBloco_)
    {
        // Constructor
        setInicioBloco(_inicioBloco_);

        setProgramaEsq(_programaEsq_);

        setComando(_comando_);

        setFimBloco(_fimBloco_);

    }

    @Override
    public Object clone()
    {
        return new ABlocoComandosBlocoComandos(
            cloneNode(this._inicioBloco_),
            cloneList(this._programaEsq_),
            cloneList(this._comando_),
            cloneNode(this._fimBloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABlocoComandosBlocoComandos(this);
    }

    public TInicioBloco getInicioBloco()
    {
        return this._inicioBloco_;
    }

    public void setInicioBloco(TInicioBloco node)
    {
        if(this._inicioBloco_ != null)
        {
            this._inicioBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicioBloco_ = node;
    }

    public LinkedList<PProgramaEsq> getProgramaEsq()
    {
        return this._programaEsq_;
    }

    public void setProgramaEsq(List<?> list)
    {
        for(PProgramaEsq e : this._programaEsq_)
        {
            e.parent(null);
        }
        this._programaEsq_.clear();

        for(Object obj_e : list)
        {
            PProgramaEsq e = (PProgramaEsq) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._programaEsq_.add(e);
        }
    }

    public LinkedList<PComando> getComando()
    {
        return this._comando_;
    }

    public void setComando(List<?> list)
    {
        for(PComando e : this._comando_)
        {
            e.parent(null);
        }
        this._comando_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comando_.add(e);
        }
    }

    public TFimBloco getFimBloco()
    {
        return this._fimBloco_;
    }

    public void setFimBloco(TFimBloco node)
    {
        if(this._fimBloco_ != null)
        {
            this._fimBloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimBloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inicioBloco_)
            + toString(this._programaEsq_)
            + toString(this._comando_)
            + toString(this._fimBloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inicioBloco_ == child)
        {
            this._inicioBloco_ = null;
            return;
        }

        if(this._programaEsq_.remove(child))
        {
            return;
        }

        if(this._comando_.remove(child))
        {
            return;
        }

        if(this._fimBloco_ == child)
        {
            this._fimBloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inicioBloco_ == oldChild)
        {
            setInicioBloco((TInicioBloco) newChild);
            return;
        }

        for(ListIterator<PProgramaEsq> i = this._programaEsq_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PProgramaEsq) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._comando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._fimBloco_ == oldChild)
        {
            setFimBloco((TFimBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
