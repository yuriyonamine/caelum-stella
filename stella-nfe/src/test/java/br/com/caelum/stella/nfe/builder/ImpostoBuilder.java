package br.com.caelum.stella.nfe.builder;

import br.com.caelum.stella.nfe.builder.impl.IIImpl;
import br.com.caelum.stella.nfe.builder.impl.IPIImpl;
import br.com.caelum.stella.nfe.builder.impl.ISSQNImpl;

public class ImpostoBuilder {

    public II createII() {
        return new IIImpl();
    }

    public IPI createIPI() {
        return new IPIImpl();
    }

    public ISSQN createISSQN() {
        return new ISSQNImpl();
    }

    public ICMSBuilder createICMS() {
        return new ICMSBuilder();
    }

}