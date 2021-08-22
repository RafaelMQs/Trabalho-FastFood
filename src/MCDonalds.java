import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class MCDonalds extends JPanel {
	private JLabel McLogo, titulo, lanche, lanche1, lanche2, lanche3, lanche4, acomp, acomp1, acomp2, acomp3, sobre,sobre1, sobre2, formpagamento;
	private ImageIcon logoIcon, imglanche1, imglanche2, imglanche3, imglanche4, imgacomp1, imgacomp2, imgacomp3,imgsobre1, imgsobre2;
	private JCheckBox checklanche1, checklanche2, checklanche3, checklanche4, checkacomp1, checkacomp2, checkacomp3,checksobre1, checksobre2;
	private JRadioButton Cartao, Vr, Dinheiro;
	private ButtonGroup btGroup;
	private JButton finalizar;


	public MCDonalds() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);
		setBackground(Color.WHITE);
		audio("McDonalds Song");

//		INICIO - Cabeçalho

		logoIcon = new ImageIcon("mcdonalds-logo.png");
		McLogo = new JLabel(logoIcon);
		McLogo.setBounds(650, 0, 94, 93);
		add(McLogo);
		titulo = new JLabel("Faça seu pedido");
		titulo.setBounds(250, 0, 500, 80);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 40));
		titulo.setForeground(Color.BLACK);
		add(titulo);

//		FIM- Cabeçalho

// 		INICIO - Lanches
		lanche = new JLabel("Lanches:");
		lanche.setBounds(10, 90, 100, 25);
		lanche.setFont(new Font("Serif", Font.BOLD, 14));
		lanche.setForeground(Color.BLACK);
		add(lanche);

		imglanche1 = new ImageIcon("bigmac.png");
		lanche1 = new JLabel(imglanche1);
		checklanche1 = new JCheckBox("BIG MAC R$21");
		lanche1.setBounds(50, 118, 128, 100);
		checklanche1.setBounds(60, 210, 105, 25);
		checklanche1.setContentAreaFilled(false);
		add(checklanche1);
		add(lanche1);

		imglanche2 = new ImageIcon("bigtasty.png");
		lanche2 = new JLabel(imglanche2);
		checklanche2 = new JCheckBox("BIG TASTY R$30");
		lanche2.setBounds(220, 120, 128, 100);
		checklanche2.setBounds(225, 210, 118, 25);
		checklanche2.setContentAreaFilled(false);
		add(checklanche2);
		add(lanche2);

		imglanche3 = new ImageIcon("bigtastyturboqueijo.png");
		lanche3 = new JLabel(imglanche3);
		checklanche3 = new JCheckBox("<html> BIG TASTY TURBO<br>QUEIJO R$32</html>");
		lanche3.setBounds(410, 120, 128, 100);
		checklanche3.setBounds(410, 212, 127, 35);
		checklanche3.setContentAreaFilled(false);
		add(checklanche3);
		add(lanche3);

		imglanche4 = new ImageIcon("duplo-quarterao-new.png");
		lanche4 = new JLabel(imglanche4);
		checklanche4 = new JCheckBox("<html> DUPLO QUARTERÃO<br>R$27 </html>");
		lanche4.setBounds(590, 120, 128, 100);
		checklanche4.setBounds(590, 215, 140, 35);
		checklanche4.setContentAreaFilled(false);
		add(checklanche4);
		add(lanche4);
// 		FIM - Lanches

//		INICIO - Acompanhamentos
		acomp = new JLabel("Acompanhamentos:");
		acomp.setBounds(10, 250, 125, 25);
		acomp.setFont(new Font("Serif", Font.BOLD, 14));
		acomp.setForeground(Color.BLACK);
		add(acomp);

		imgacomp1 = new ImageIcon("fritasv3.png");
		acomp1 = new JLabel(imgacomp1);
		checkacomp1 = new JCheckBox("Batata Frita R$6");
		acomp1.setBounds(150, 278, 128, 100);
		checkacomp1.setBounds(155, 375, 115, 25);
		checkacomp1.setContentAreaFilled(false);
		add(checkacomp1);
		add(acomp1);

		imgacomp2 = new ImageIcon("nuggets.png");
		acomp2 = new JLabel(imgacomp2);
		checkacomp2 = new JCheckBox("4Nuggets R$7");
		acomp2.setBounds(340, 278, 128, 100);
		checkacomp2.setBounds(350, 375, 104, 25);
		checkacomp2.setContentAreaFilled(false);
		add(checkacomp2);
		add(acomp2);

		imgacomp3 = new ImageIcon("salada.png");
		acomp3 = new JLabel(imgacomp3);
		checkacomp3 = new JCheckBox("Salada R$8");
		acomp3.setBounds(520, 278, 128, 100);
		checkacomp3.setBounds(535, 375, 90, 25);
		checkacomp3.setContentAreaFilled(false);
		add(checkacomp3);
		add(acomp3);
//		FIM - Acompanhamentos

//		INICIO - Sobremesa
		sobre = new JLabel("Sobremesas:");
		sobre.setBounds(10, 410, 125, 25);
		sobre.setFont(new Font("Serif", Font.BOLD, 14));
		sobre.setForeground(Color.BLACK);
		add(sobre);

		imgsobre1 = new ImageIcon("casquinhas.png");
		sobre1 = new JLabel(imgsobre1);
		checksobre1 = new JCheckBox("Casquinha R$3");
		sobre1.setBounds(250, 438, 128, 100);
		checksobre1.setBounds(260, 535, 115, 25);
		checksobre1.setContentAreaFilled(false);
		add(checksobre1);
		add(sobre1);

		imgsobre2 = new ImageIcon("sundae.png");
		sobre2 = new JLabel(imgsobre2);
		checksobre2 = new JCheckBox("Sundae R$6");
		sobre2.setBounds(420, 438, 128, 100);
		checksobre2.setBounds(435, 535, 95, 25);
		checksobre2.setContentAreaFilled(false);
		add(checksobre2);
		add(sobre2);
//		FIM - Sobremesa

//		INICIO - Formas de pagamento
		formpagamento = new JLabel("Forma de pagamento:");
		formpagamento.setBounds(10, 590, 150, 25);
		formpagamento.setFont(new Font("Serif", Font.BOLD, 14));
		formpagamento.setForeground(Color.BLACK);
		add(formpagamento);

		btGroup = new ButtonGroup();

		Cartao = new JRadioButton("Cartão");
		Cartao.setBounds(150, 592, 63, 25);
		Cartao.setContentAreaFilled(false);
		btGroup.add(Cartao);
		add(Cartao);

		Vr = new JRadioButton("Vr");
		Vr.setBounds(220, 592, 38, 25);
		Vr.setContentAreaFilled(false);
		btGroup.add(Vr);
		add(Vr);

		Dinheiro = new JRadioButton("Dinheiro");
		Dinheiro.setBounds(260, 592, 72, 25);
		Dinheiro.setContentAreaFilled(false);
		btGroup.add(Dinheiro);
		add(Dinheiro);

		finalizar = new JButton("Finalizar");
		finalizar.setBounds(350, 592, 85, 25);
		finalizar.setFocusable(false);
		add(finalizar);

//		FIM - Formas de pagamento
	}

	private void definirEventos() {
		finalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valortotal = 0;
				String formapag = "";
				String selecao = "Selecionados: ";
				if (checklanche1.isSelected()) { // verifica quais caixas estão selecionadas.
					selecao += " Big Mac";
					valortotal += 21;
				}
				if (checklanche2.isSelected()) {
					selecao += ", Big Tasty";
					valortotal += 30;
				}
				if (checklanche3.isSelected()) {
					selecao += ", Big Tasty Turbo Queijo";
					valortotal += 32;
				}
				if (checklanche4.isSelected()) {
					selecao += ", Duplo Quarterão";
					valortotal += 27;
				}
				if (checkacomp1.isSelected()) {
					selecao += ", Batata Frita";
					valortotal += 6;
				}
				if (checkacomp2.isSelected()) {
					selecao += ", 4Nuggets";
					valortotal += 7;
				}
				if (checkacomp3.isSelected()) {
					selecao += ", Salada";
					valortotal += 8;
				}
				if (checksobre1.isSelected()) {
					selecao += ", Casquinha";
					valortotal += 3;
				}
				if (checksobre2.isSelected()) {
					selecao += ", Sundae";
					valortotal += 6;
				}
				if (selecao == "Selecionados: ") {
					selecao += "Nenhum";
				}
				if (Cartao.isSelected()) {
					formapag = "Cartão";
				}
				else if (Vr.isSelected()) {
					formapag = "Vr";
				}
				else if (Dinheiro.isSelected()) {
					formapag = "Dinheiro";
				}
				else {
					formapag = "Indefinida";
				}
				JOptionPane.showMessageDialog(null, selecao+"\n Valor total: R$"+valortotal+"\n Forma de Pagamento: "+formapag);
			}
		});
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		g.drawLine(0, 80, 650, 80);
		g.drawLine(744, 80, 800, 80);
	}

	public void audio(String nome) {
		URL url = MCDonalds.class.getResource(nome + ".wav");
		AudioClip audio = Applet.newAudioClip(url);
		audio.play();

	}

	public static void main(String args[]) {

		JFrame frame = new JFrame("FastFood - MCDonalds");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new MCDonalds());
		frame.setBounds(300, 10, 800, 700);
		frame.setVisible(true);
	}

}