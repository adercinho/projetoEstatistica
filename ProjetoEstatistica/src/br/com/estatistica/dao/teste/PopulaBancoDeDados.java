package br.com.estatistica.dao.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.estatistica.entity.CaracteristicaDimensao;
import br.com.estatistica.entity.Dimensao;
import br.com.estatistica.entity.TipoDimensao;
import br.com.estatistica.util.JPAUtil;

public class PopulaBancoDeDados {

	public static void main(String[] args) {
		salvaDimensao();
	}

	private static void salvaDimensao() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		

		Dimensao dimensao1 = new Dimensao();
		dimensao1.setId(23);
		dimensao1.setNome("Dimensão Ambiental");
		
		List<TipoDimensao> tiposDimensoes1 = new ArrayList<TipoDimensao>();
		TipoDimensao td1 = new TipoDimensao();
		td1.setId(1);
		td1.setNome("Água");
		td1.setDimensao(dimensao1);
		
		
		List<CaracteristicaDimensao> caracteristicas1 = new ArrayList<CaracteristicaDimensao>();
		CaracteristicaDimensao caracteristica1 = new CaracteristicaDimensao();
		caracteristica1.setId(1);
		caracteristica1.setNome("Despejo de esgoto");
		caracteristica1.setTipoDimensao(td1);
		
		CaracteristicaDimensao caracteristica2 = new CaracteristicaDimensao();
		caracteristica2.setId(2);
		caracteristica2.setNome("Despejo de resíduos sólidos");
		caracteristica2.setTipoDimensao(td1);
		
		CaracteristicaDimensao caracteristica3 = new CaracteristicaDimensao();
		caracteristica3.setId(3);
		caracteristica3.setNome("Despejo de resíduos tóxicos");
		caracteristica3.setTipoDimensao(td1);
		
		CaracteristicaDimensao caracteristica4 = new CaracteristicaDimensao();
		caracteristica4.setId(4);
		caracteristica4.setNome("Uso ilegal de água superficial");
		caracteristica4.setTipoDimensao(td1);
		
		CaracteristicaDimensao caracteristica5 = new CaracteristicaDimensao();
		caracteristica5.setId(5);
		caracteristica5.setNome("Dragagem de leitos de rios ou córregos");
		caracteristica5.setTipoDimensao(td1);
		
		CaracteristicaDimensao caracteristica6 = new CaracteristicaDimensao();
		caracteristica6.setId(6);
		caracteristica6.setNome("Poço artesiano irregular ou ilegal");
		caracteristica6.setTipoDimensao(td1);
		
		caracteristicas1.add(caracteristica1);
		caracteristicas1.add(caracteristica2);
		caracteristicas1.add(caracteristica3);
		caracteristicas1.add(caracteristica4);
		caracteristicas1.add(caracteristica5);
		caracteristicas1.add(caracteristica6);
		td1.setCaracteristicas(caracteristicas1);
		tiposDimensoes1.add(td1);
		
		
		
		TipoDimensao td2 = new TipoDimensao();
		td2.setId(2);
		td2.setNome("Ar");
		td2.setDimensao(dimensao1);
		
		List<CaracteristicaDimensao> caracteristicas2 = new ArrayList<CaracteristicaDimensao>();
		CaracteristicaDimensao caracteristica7 = new CaracteristicaDimensao();
		caracteristica7.setId(7);
		caracteristica7.setNome("Fumaça eliminada por veículos");
		caracteristica7.setTipoDimensao(td2);
		
		CaracteristicaDimensao caracteristica8 = new CaracteristicaDimensao();
		caracteristica8.setId(8);
		caracteristica8.setNome("Fumaça eliminada por fábricas");
		caracteristica8.setTipoDimensao(td2);
		
		CaracteristicaDimensao caracteristica9 = new CaracteristicaDimensao();
		caracteristica9.setId(9);
		caracteristica9.setNome("Queimadas");
		caracteristica9.setTipoDimensao(td2);
		
		CaracteristicaDimensao caracteristica10 = new CaracteristicaDimensao();
		caracteristica10.setId(10);
		caracteristica10.setNome("Poeira");
		caracteristica10.setTipoDimensao(td2);
		
		CaracteristicaDimensao caracteristica11 = new CaracteristicaDimensao();
		caracteristica11.setId(11);
		caracteristica11.setNome("Emissão de odores fétidos (curtumes, pocilgas, esgoto não tratado, etc)");
		caracteristica11.setTipoDimensao(td2);
		
		caracteristicas2.add(caracteristica7);
		caracteristicas2.add(caracteristica8);
		caracteristicas2.add(caracteristica9);
		caracteristicas2.add(caracteristica10);
		caracteristicas2.add(caracteristica11);
		td2.setCaracteristicas(caracteristicas2);
		tiposDimensoes1.add(td2);
		
		
		TipoDimensao td3 = new TipoDimensao();
		td3.setId(3);
		td3.setNome("Solo");
		td3.setDimensao(dimensao1);
		
		List<CaracteristicaDimensao> caracteristicas3 = new ArrayList<CaracteristicaDimensao>();
		CaracteristicaDimensao caracteristica12 = new CaracteristicaDimensao();
		caracteristica12.setId(12);
		caracteristica12.setNome("Despejo de esgoto no solo");
		caracteristica12.setTipoDimensao(td3);
		
		CaracteristicaDimensao caracteristica13 = new CaracteristicaDimensao();
		caracteristica13.setId(13);
		caracteristica13.setNome("Depósito clandestino/irregular de resíduos sólidos urbanos");
		caracteristica13.setTipoDimensao(td3);
		
		CaracteristicaDimensao caracteristica14 = new CaracteristicaDimensao();
		caracteristica14.setId(14);
		caracteristica14.setNome("Depósito clandestino/irregular de resíduos de construção civil");
		caracteristica14.setTipoDimensao(td3);
		
		CaracteristicaDimensao caracteristica15 = new CaracteristicaDimensao();
		caracteristica15.setId(15);
		caracteristica15.setNome("Extração irregular de areia, argila ou cascalho");
		caracteristica15.setTipoDimensao(td3);
		
		CaracteristicaDimensao caracteristica16 = new CaracteristicaDimensao();
		caracteristica16.setId(16);
		caracteristica16.setNome("Uso ilegal do solo (plantio etc)");
		caracteristica16.setTipoDimensao(td3);
		
		CaracteristicaDimensao caracteristica17 = new CaracteristicaDimensao();
		caracteristica17.setId(17);
		caracteristica17.setNome("Ocorrência de erosões (sulcos, ravinas, voçorocas)");
		caracteristica17.setTipoDimensao(td3);
		
		
		caracteristicas3.add(caracteristica12);
		caracteristicas3.add(caracteristica13);
		caracteristicas3.add(caracteristica14);
		caracteristicas3.add(caracteristica15);
		caracteristicas3.add(caracteristica16);
		caracteristicas3.add(caracteristica17);
		td3.setCaracteristicas(caracteristicas3);
		tiposDimensoes1.add(td3);
		
		
		TipoDimensao td4 = new TipoDimensao();
		td4.setId(4);
		td4.setNome("Desmatamento/extração/exploração/caça/pesca/etc");
		td4.setDimensao(dimensao1);
		
		
		List<CaracteristicaDimensao> caracteristicas4 = new ArrayList<CaracteristicaDimensao>();
		CaracteristicaDimensao caracteristica18 = new CaracteristicaDimensao();
		caracteristica18.setId(18);
		caracteristica18.setNome("Desmatamento de vegetação remanescente");
		caracteristica18.setTipoDimensao(td4);
		
		CaracteristicaDimensao caracteristica19 = new CaracteristicaDimensao();
		caracteristica19.setId(19);
		caracteristica19.setNome("Extração ou exploração de recursos naturais de forma irregular");
		caracteristica19.setTipoDimensao(td4);
		
		CaracteristicaDimensao caracteristica20 = new CaracteristicaDimensao();
		caracteristica20.setId(20);
		caracteristica20.setNome("Caça irregular");
		caracteristica20.setTipoDimensao(td4);
		
		CaracteristicaDimensao caracteristica21 = new CaracteristicaDimensao();
		caracteristica21.setId(21);
		caracteristica21.setNome("Pesca irregular");
		caracteristica21.setTipoDimensao(td4);
		
		
		caracteristicas4.add(caracteristica18);
		caracteristicas4.add(caracteristica19);
		caracteristicas4.add(caracteristica20);
		caracteristicas4.add(caracteristica21);

		td4.setCaracteristicas(caracteristicas4);
		tiposDimensoes1.add(td4);
		
		
		TipoDimensao td5 = new TipoDimensao();
		td5.setId(5);
		td5.setNome("Invasão");
		td5.setDimensao(dimensao1);
		
		List<CaracteristicaDimensao> caracteristicas5 = new ArrayList<CaracteristicaDimensao>();
		CaracteristicaDimensao caracteristica22 = new CaracteristicaDimensao();
		caracteristica22.setId(22);
		caracteristica22.setNome("Invasão em áreas protegidas");
		caracteristica22.setTipoDimensao(td5);
		
		CaracteristicaDimensao caracteristica23 = new CaracteristicaDimensao();
		caracteristica23.setId(23);
		caracteristica23.setNome("Invasão em matas ciliares");
		caracteristica23.setTipoDimensao(td5);
		
		
		caracteristicas5.add(caracteristica22);
		caracteristicas5.add(caracteristica23);

		td5.setCaracteristicas(caracteristicas5);
		tiposDimensoes1.add(td5);
		
		
		dimensao1.setTiposDimensoes(tiposDimensoes1);
		
		// DIMENSAO 2
		
		Dimensao dimensao2 = new Dimensao();
		dimensao2.setId(36);
		dimensao2.setNome("Dimensão Social");
		
		
		List<TipoDimensao> tiposDimensoes2 = new ArrayList<TipoDimensao>();
		TipoDimensao td6 = new TipoDimensao();
		td6.setId(6);
		td6.setNome("Segurança");
		td6.setDimensao(dimensao2);
		
		List<CaracteristicaDimensao> caracteristicas6 = new ArrayList<CaracteristicaDimensao>();
		
		CaracteristicaDimensao caracteristica24 = new CaracteristicaDimensao();
		caracteristica24.setId(24);
		caracteristica24.setNome("Assalto");
		caracteristica24.setTipoDimensao(td6);
		
		CaracteristicaDimensao caracteristica25 = new CaracteristicaDimensao();
		caracteristica25.setId(25);
		caracteristica25.setNome("Roubo");
		caracteristica25.setTipoDimensao(td6);
		
		CaracteristicaDimensao caracteristica26 = new CaracteristicaDimensao();
		caracteristica26.setId(26);
		caracteristica26.setNome("Vandalismo");
		caracteristica26.setTipoDimensao(td6);
		
		CaracteristicaDimensao caracteristica27 = new CaracteristicaDimensao();
		caracteristica27.setId(27);
		caracteristica27.setNome("Estupro");
		caracteristica27.setTipoDimensao(td6);
		
		CaracteristicaDimensao caracteristica28 = new CaracteristicaDimensao();
		caracteristica28.setId(28);
		caracteristica28.setNome("Violência contra mulher, criança, idoso");
		caracteristica28.setTipoDimensao(td6);
		
		CaracteristicaDimensao caracteristica29 = new CaracteristicaDimensao();
		caracteristica29.setId(29);
		caracteristica29.setNome("Gangs");
		caracteristica29.setTipoDimensao(td6);
		
		CaracteristicaDimensao caracteristica30 = new CaracteristicaDimensao();
		caracteristica30.setId(30);
		caracteristica30.setNome("Traficantes");
		caracteristica30.setTipoDimensao(td6);
		
		CaracteristicaDimensao caracteristica31 = new CaracteristicaDimensao();
		caracteristica31.setId(31);
		caracteristica31.setNome("Usuários de drogas ilícitas");
		caracteristica31.setTipoDimensao(td6);
		
		
		caracteristicas6.add(caracteristica24);
		caracteristicas6.add(caracteristica25);
		caracteristicas6.add(caracteristica26);
		caracteristicas6.add(caracteristica27);
		caracteristicas6.add(caracteristica28);
		caracteristicas6.add(caracteristica29);
		caracteristicas6.add(caracteristica30);
		caracteristicas6.add(caracteristica31);

		td6.setCaracteristicas(caracteristicas6);
		
		tiposDimensoes2.add(td6);
		
		
		
		
		TipoDimensao td7 = new TipoDimensao();
		td7.setId(7);
		td7.setNome("Educação");
		td7.setDimensao(dimensao2);
		
		List<CaracteristicaDimensao> caracteristicas7 = new ArrayList<CaracteristicaDimensao>();
		
		CaracteristicaDimensao caracteristica32 = new CaracteristicaDimensao();
		caracteristica32.setId(32);
		caracteristica32.setNome("Escola sem professor");
		caracteristica32.setTipoDimensao(td7);
		
		CaracteristicaDimensao caracteristica33 = new CaracteristicaDimensao();
		caracteristica33.setId(33);
		caracteristica33.setNome("Escola com problemas estruturais");
		caracteristica33.setTipoDimensao(td6);
		
		CaracteristicaDimensao caracteristica34 = new CaracteristicaDimensao();
		caracteristica34.setId(34);
		caracteristica34.setNome("Falta de creche");
		caracteristica34.setTipoDimensao(td7);
		
		CaracteristicaDimensao caracteristica35 = new CaracteristicaDimensao();
		caracteristica35.setId(35);
		caracteristica35.setNome("Falta de escola de ensino fundamental");
		caracteristica35.setTipoDimensao(td7);
		
		CaracteristicaDimensao caracteristica36 = new CaracteristicaDimensao();
		caracteristica36.setId(36);
		caracteristica36.setNome("Falta de escola de ensino médio");
		caracteristica36.setTipoDimensao(td7);
		
		CaracteristicaDimensao caracteristica37 = new CaracteristicaDimensao();
		caracteristica37.setId(37);
		caracteristica37.setNome("Falta de faculdade ou universidade");
		caracteristica37.setTipoDimensao(td7);
		
		
		caracteristicas7.add(caracteristica32);
		caracteristicas7.add(caracteristica33);
		caracteristicas7.add(caracteristica34);
		caracteristicas7.add(caracteristica35);
		caracteristicas7.add(caracteristica36);
		caracteristicas7.add(caracteristica37);
		td7.setCaracteristicas(caracteristicas7);
		
		tiposDimensoes2.add(td7);
		
		
		TipoDimensao td8 = new TipoDimensao();
		td8.setId(8);
		td8.setDimensao(dimensao2);
		td8.setNome("Saúde");
		
		
		List<CaracteristicaDimensao> caracteristicas8 = new ArrayList<CaracteristicaDimensao>();
		
		CaracteristicaDimensao caracteristica38 = new CaracteristicaDimensao();
		caracteristica38.setId(38);
		caracteristica38.setNome("Falta de posto de saúde");
		caracteristica38.setTipoDimensao(td8);
		
		CaracteristicaDimensao caracteristica39 = new CaracteristicaDimensao();
		caracteristica39.setId(39);
		caracteristica39.setNome("Falta de hospital");
		caracteristica39.setTipoDimensao(td8);
		
		CaracteristicaDimensao caracteristica40 = new CaracteristicaDimensao();
		caracteristica40.setId(40);
		caracteristica40.setNome("Falta de médico");
		caracteristica40.setTipoDimensao(td8);
		
		CaracteristicaDimensao caracteristica41 = new CaracteristicaDimensao();
		caracteristica41.setId(41);
		caracteristica41.setNome("Falta de medicamento");
		caracteristica41.setTipoDimensao(td8);
		
		CaracteristicaDimensao caracteristica42 = new CaracteristicaDimensao();
		caracteristica42.setId(42);
		caracteristica42.setNome("Superlotação");
		caracteristica42.setTipoDimensao(td8);
		
		CaracteristicaDimensao caracteristica43 = new CaracteristicaDimensao();
		caracteristica43.setId(43);
		caracteristica43.setNome("Atendimento ruim");
		caracteristica43.setTipoDimensao(td8);
		
		CaracteristicaDimensao caracteristica44 = new CaracteristicaDimensao();
		caracteristica44.setId(44);
		caracteristica44.setNome("Falta de leito");
		caracteristica44.setTipoDimensao(td8);
		
		CaracteristicaDimensao caracteristica45 = new CaracteristicaDimensao();
		caracteristica45.setId(45);
		caracteristica45.setNome("Falta de equipamentos");
		caracteristica45.setTipoDimensao(td8);
		
		
		caracteristicas8.add(caracteristica38);
		caracteristicas8.add(caracteristica39);
		caracteristicas8.add(caracteristica40);
		caracteristicas8.add(caracteristica41);
		caracteristicas8.add(caracteristica42);
		caracteristicas8.add(caracteristica43);
		caracteristicas8.add(caracteristica44);
		caracteristicas8.add(caracteristica45);
		td8.setCaracteristicas(caracteristicas8);
		
		tiposDimensoes2.add(td8);
		
		TipoDimensao td9 = new TipoDimensao();
		td9.setId(9);
		td9.setDimensao(dimensao2);
		td9.setNome("Infraestrutura Urbana");
		
		List<CaracteristicaDimensao> caracteristicas9 = new ArrayList<CaracteristicaDimensao>();
		
		CaracteristicaDimensao caracteristica46 = new CaracteristicaDimensao();
		caracteristica46.setId(46);
		caracteristica46.setNome("Iluminação pública deficiente, inexistente");
		caracteristica46.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica47 = new CaracteristicaDimensao();
		caracteristica47.setId(47);
		caracteristica47.setNome("Pavimentação pública deficiente, inexistente");
		caracteristica47.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica48 = new CaracteristicaDimensao();
		caracteristica48.setId(48);
		caracteristica48.setNome("Rede de coleta de esgoto inexistente");
		caracteristica48.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica49 = new CaracteristicaDimensao();
		caracteristica49.setId(49);
		caracteristica49.setNome("Abastecimento de água insuficiente, inexistente");
		caracteristica49.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica50 = new CaracteristicaDimensao();
		caracteristica50.setId(50);
		caracteristica50.setNome("Atendimento de energia elétrica insatisfatório, inexistente");
		caracteristica50.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica51 = new CaracteristicaDimensao();
		caracteristica51.setId(51);
		caracteristica51.setNome("Ponto de alagamento, inundação ou enchente");
		caracteristica51.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica52 = new CaracteristicaDimensao();
		caracteristica52.setId(52);
		caracteristica52.setNome("Ponto de congestionamento");
		caracteristica52.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica53 = new CaracteristicaDimensao();
		caracteristica53.setId(53);
		caracteristica53.setNome("Acidentes envolvendo veículos, motos, ciclistas, pedestres");
		caracteristica53.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica54 = new CaracteristicaDimensao();
		caracteristica54.setId(54);
		caracteristica54.setNome("Buracos/erosões em vias públicas");
		caracteristica54.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica55 = new CaracteristicaDimensao();
		caracteristica55.setId(55);
		caracteristica55.setNome("Inexistência de bueiros (galerias de água pluvial)");
		caracteristica55.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica56 = new CaracteristicaDimensao();
		caracteristica56.setId(56);
		caracteristica56.setNome("Drenagem inadequada de águas pluviais");
		caracteristica56.setTipoDimensao(td9);
		
		CaracteristicaDimensao caracteristica57 = new CaracteristicaDimensao();
		caracteristica57.setId(57);
		caracteristica57.setNome("Ponto de estrangulamento irregular de drenagem fluvial (represa/barragem clandestina)");
		caracteristica57.setTipoDimensao(td9);
		
		
		caracteristicas9.add(caracteristica46);
		caracteristicas9.add(caracteristica47);
		caracteristicas9.add(caracteristica48);
		caracteristicas9.add(caracteristica49);
		caracteristicas9.add(caracteristica50);
		caracteristicas9.add(caracteristica51);
		caracteristicas9.add(caracteristica52);
		caracteristicas9.add(caracteristica53);
		caracteristicas9.add(caracteristica54);
		caracteristicas9.add(caracteristica55);
		caracteristicas9.add(caracteristica56);
		caracteristicas9.add(caracteristica57);
		
		td9.setCaracteristicas(caracteristicas9);
		tiposDimensoes2.add(td9);
		
		
		TipoDimensao td10 = new TipoDimensao();
		td10.setId(10);
		td10.setNome("Invasão");
		td10.setDimensao(dimensao2);
		tiposDimensoes2.add(td10);
		
		List<CaracteristicaDimensao> caracteristicas10 = new ArrayList<CaracteristicaDimensao>();
		
		CaracteristicaDimensao caracteristica58 = new CaracteristicaDimensao();
		caracteristica58.setId(58);
		caracteristica58.setNome("Invasão de patrimônio público");
		caracteristica58.setTipoDimensao(td10);
		
		CaracteristicaDimensao caracteristica59 = new CaracteristicaDimensao();
		caracteristica59.setId(59);
		caracteristica59.setNome("Invasão de terreno público");
		caracteristica59.setTipoDimensao(td10);
		
		
		caracteristicas10.add(caracteristica58);
		caracteristicas10.add(caracteristica59);
		
		td10.setCaracteristicas(caracteristicas10);
		dimensao2.setTiposDimensoes(tiposDimensoes2);
		
		dimensao1 = entityManager.merge(dimensao1);
		dimensao2 = entityManager.merge(dimensao2);
		
		entityManager.persist(dimensao1);
		entityManager.persist(dimensao2);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
