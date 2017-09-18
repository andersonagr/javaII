package javaII;

class AtualizadorDeContas extends Conta {
    protected double saldoTotal = 0;
    protected double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        // aqui você imprime o saldo anterior
        // atualiza a conta com a taxa selic,
        // e depois imprime o saldo final
        // lembrando de somar o saldo final ao atributo saldoTotal
    	System.out.println("=========================================================");
    	System.out.println("Seus Saldo Atual é " + c.getSaldo());
    	System.out.println("=========================================================");
    	c.atualiza(this.selic);
    	System.out.println("Seus Saldo Atualizado pela Selic é " + c.getSaldo());
      	this.saldoTotal += c.getSaldo();
      	System.out.println("Seus Saldo total é " + this.saldoTotal);	
    	
    }

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

   
}