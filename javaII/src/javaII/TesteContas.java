package javaII;

public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Conta c = new Conta();
			ContaCorrente cc = new ContaCorrente();
			ContaPoupanca cp = new ContaPoupanca();
			AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
			
			c.deposita(1000);
			cc.deposita(1000);
			cp.deposita(1000);
			
			c.atualiza(0.01);
			cc.atualiza(0.01);
			cp.atualiza(0.01);
			
			System.out.println("Seu saldo � " + c.getSaldo());
			System.out.println("Seu saldo � " + cc.getSaldo());
			System.out.println("Seu saldo � " + cp.getSaldo());
			
			adc.roda(c);
			adc.roda(cc);
			adc.roda(cp);
			System.out.println("Seu saldo total � " + adc.saldoTotal);
		
		}

	}


