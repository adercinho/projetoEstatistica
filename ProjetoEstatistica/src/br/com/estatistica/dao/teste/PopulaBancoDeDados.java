package br.com.estatistica.dao.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.estatistica.entity.TipoMarcador;
import br.com.estatistica.entity.Marcador;
import br.com.estatistica.entity.GrupoTipoMarcador;
import br.com.estatistica.util.JPAUtil;

public class PopulaBancoDeDados {

	public static void main(String[] args) {
		salvaDimensao();
	}

	private static void salvaDimensao() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		

		Marcador marcador1 = new Marcador();
		marcador1.setId(23);
		marcador1.setNome("Dimensão Ambiental");
		
		List<GrupoTipoMarcador> tiposDimensoes1 = new ArrayList<GrupoTipoMarcador>();
		GrupoTipoMarcador td1 = new GrupoTipoMarcador();
		td1.setId(1);
		td1.setNome("Água");
		td1.setMarcador(marcador1);
		
		
		List<TipoMarcador> tiposMarcadores1 = new ArrayList<TipoMarcador>();
		TipoMarcador tipoMarcador1 = new TipoMarcador();
		tipoMarcador1.setId(1);
		tipoMarcador1.setNome("Despejo de esgoto");
		tipoMarcador1.setGrupoTipoMarcador(td1);
		
		TipoMarcador tipoMarcador2 = new TipoMarcador();
		tipoMarcador2.setId(2);
		tipoMarcador2.setNome("Despejo de resíduos sólidos");
		tipoMarcador2.setGrupoTipoMarcador(td1);
		
		TipoMarcador tipoMarcador3 = new TipoMarcador();
		tipoMarcador3.setId(3);
		tipoMarcador3.setNome("Despejo de resíduos tóxicos");
		tipoMarcador3.setGrupoTipoMarcador(td1);
		
		TipoMarcador tipoMarcador4 = new TipoMarcador();
		tipoMarcador4.setId(4);
		tipoMarcador4.setNome("Uso ilegal de água superficial");
		tipoMarcador4.setGrupoTipoMarcador(td1);
		
		TipoMarcador tipoMarcador5 = new TipoMarcador();
		tipoMarcador5.setId(5);
		tipoMarcador5.setNome("Dragagem de leitos de rios ou córregos");
		tipoMarcador5.setGrupoTipoMarcador(td1);
		
		TipoMarcador tipoMarcador6 = new TipoMarcador();
		tipoMarcador6.setId(6);
		tipoMarcador6.setNome("Poço artesiano irregular ou ilegal");
		tipoMarcador6.setGrupoTipoMarcador(td1);
		
		tiposMarcadores1.add(tipoMarcador1);
		tiposMarcadores1.add(tipoMarcador2);
		tiposMarcadores1.add(tipoMarcador3);
		tiposMarcadores1.add(tipoMarcador4);
		tiposMarcadores1.add(tipoMarcador5);
		tiposMarcadores1.add(tipoMarcador6);
		td1.setTiposMarcadores(tiposMarcadores1);
		tiposDimensoes1.add(td1);
		
		
		
		GrupoTipoMarcador td2 = new GrupoTipoMarcador();
		td2.setId(2);
		td2.setNome("Ar");
		td2.setMarcador(marcador1);

		
		List<TipoMarcador> tiposMarcadores2 = new ArrayList<TipoMarcador>();
		TipoMarcador tipoMarcador7 = new TipoMarcador();
		tipoMarcador7.setId(7);
		tipoMarcador7.setNome("Fumaça eliminada por veículos");
		tipoMarcador7.setGrupoTipoMarcador(td2);
		
		TipoMarcador tipoMarcador8 = new TipoMarcador();
		tipoMarcador8.setId(8);
		tipoMarcador8.setNome("Fumaça eliminada por fábricas");
		tipoMarcador8.setGrupoTipoMarcador(td2);
		
		TipoMarcador tipoMarcador9 = new TipoMarcador();
		tipoMarcador9.setId(9);
		tipoMarcador9.setNome("Queimadas");
		tipoMarcador9.setGrupoTipoMarcador(td2);
		
		TipoMarcador tipoMarcador10 = new TipoMarcador();
		tipoMarcador10.setId(10);
		tipoMarcador10.setNome("Poeira");
		tipoMarcador10.setGrupoTipoMarcador(td2);
		
		TipoMarcador tipoMarcador11 = new TipoMarcador();
		tipoMarcador11.setId(11);
		tipoMarcador11.setNome("Emissão de odores fétidos (curtumes, pocilgas, esgoto não tratado, etc)");
		tipoMarcador11.setGrupoTipoMarcador(td2);
		
		tiposMarcadores2.add(tipoMarcador7);
		tiposMarcadores2.add(tipoMarcador8);
		tiposMarcadores2.add(tipoMarcador9);
		tiposMarcadores2.add(tipoMarcador10);
		tiposMarcadores2.add(tipoMarcador11);
		td2.setTiposMarcadores(tiposMarcadores2);
		tiposDimensoes1.add(td2);
		
		
		GrupoTipoMarcador td3 = new GrupoTipoMarcador();
		td3.setId(3);
		td3.setNome("Solo");
		td3.setMarcador(marcador1);
		
		List<TipoMarcador> tiposMarcadores3 = new ArrayList<TipoMarcador>();
		TipoMarcador tipoMarcador12 = new TipoMarcador();
		tipoMarcador12.setId(12);
		tipoMarcador12.setNome("Despejo de esgoto no solo");
		tipoMarcador12.setGrupoTipoMarcador(td3);
		
		TipoMarcador tipoMarcador13 = new TipoMarcador();
		tipoMarcador13.setId(13);
		tipoMarcador13.setNome("Depósito clandestino/irregular de resíduos sólidos urbanos");
		tipoMarcador13.setGrupoTipoMarcador(td3);
		
		TipoMarcador tipoMarcador14 = new TipoMarcador();
		tipoMarcador14.setId(14);
		tipoMarcador14.setNome("Depósito clandestino/irregular de resíduos de construção civil");
		tipoMarcador14.setGrupoTipoMarcador(td3);
		
		TipoMarcador tipoMarcador15 = new TipoMarcador();
		tipoMarcador15.setId(15);
		tipoMarcador15.setNome("Extração irregular de areia, argila ou cascalho");
		tipoMarcador15.setGrupoTipoMarcador(td3);
		
		TipoMarcador tipoMarcador16 = new TipoMarcador();
		tipoMarcador16.setId(16);
		tipoMarcador16.setNome("Uso ilegal do solo (plantio etc)");
		tipoMarcador16.setGrupoTipoMarcador(td3);
		
		TipoMarcador tipoMarcador17 = new TipoMarcador();
		tipoMarcador17.setId(17);
		tipoMarcador17.setNome("Ocorrência de erosões (sulcos, ravinas, voçorocas)");
		tipoMarcador17.setGrupoTipoMarcador(td3);
		
		
		tiposMarcadores3.add(tipoMarcador12);
		tiposMarcadores3.add(tipoMarcador13);
		tiposMarcadores3.add(tipoMarcador14);
		tiposMarcadores3.add(tipoMarcador15);
		tiposMarcadores3.add(tipoMarcador16);
		tiposMarcadores3.add(tipoMarcador17);
		td3.setTiposMarcadores(tiposMarcadores3);
		tiposDimensoes1.add(td3);
		
		
		GrupoTipoMarcador td4 = new GrupoTipoMarcador();
		td4.setId(4);
		td4.setNome("Desmatamento/extração/exploração/caça/pesca/etc");
		td4.setMarcador(marcador1);
		
		
		List<TipoMarcador> tiposMarcadores4 = new ArrayList<TipoMarcador>();
		TipoMarcador tipoMarcador18 = new TipoMarcador();
		tipoMarcador18.setId(18);
		tipoMarcador18.setNome("Desmatamento de vegetação remanescente");
		tipoMarcador18.setGrupoTipoMarcador(td4);
		
		TipoMarcador tipoMarcador19 = new TipoMarcador();
		tipoMarcador19.setId(19);
		tipoMarcador19.setNome("Extração ou exploração de recursos naturais de forma irregular");
		tipoMarcador19.setGrupoTipoMarcador(td4);
		
		TipoMarcador tipoMarcador20 = new TipoMarcador();
		tipoMarcador20.setId(20);
		tipoMarcador20.setNome("Caça irregular");
		tipoMarcador20.setGrupoTipoMarcador(td4);
		
		TipoMarcador tipoMarcador21 = new TipoMarcador();
		tipoMarcador21.setId(21);
		tipoMarcador21.setNome("Pesca irregular");
		tipoMarcador21.setGrupoTipoMarcador(td4);
		
		
		tiposMarcadores4.add(tipoMarcador18);
		tiposMarcadores4.add(tipoMarcador19);
		tiposMarcadores4.add(tipoMarcador20);
		tiposMarcadores4.add(tipoMarcador21);

		td4.setTiposMarcadores(tiposMarcadores4);
		tiposDimensoes1.add(td4);
		
		
		GrupoTipoMarcador td5 = new GrupoTipoMarcador();
		td5.setId(5);
		td5.setNome("Invasão");
		td5.setMarcador(marcador1);
		
		List<TipoMarcador> tiposMarcadores5 = new ArrayList<TipoMarcador>();
		TipoMarcador tipoMarcador22 = new TipoMarcador();
		tipoMarcador22.setId(22);
		tipoMarcador22.setNome("Invasão em áreas protegidas");
		tipoMarcador22.setGrupoTipoMarcador(td5);
		
		TipoMarcador tipoMarcador23 = new TipoMarcador();
		tipoMarcador23.setId(23);
		tipoMarcador23.setNome("Invasão em matas ciliares");
		tipoMarcador23.setGrupoTipoMarcador(td5);
		
		
		tiposMarcadores5.add(tipoMarcador22);
		tiposMarcadores5.add(tipoMarcador23);

		td5.setTiposMarcadores(tiposMarcadores5);
		tiposDimensoes1.add(td5);

		
		// DIMENSAO 2
		
		Marcador marcador2 = new Marcador();
		marcador2.setId(36);
		marcador2.setNome("Dimensão Social");
		
		
		List<GrupoTipoMarcador> tiposDimensoes2 = new ArrayList<GrupoTipoMarcador>();
		GrupoTipoMarcador td6 = new GrupoTipoMarcador();
		td6.setId(6);
		td6.setNome("Segurança");
		td6.setMarcador(marcador2);
		
		List<TipoMarcador> tiposMarcadores6 = new ArrayList<TipoMarcador>();
		
		TipoMarcador tipoMarcador24 = new TipoMarcador();
		tipoMarcador24.setId(24);
		tipoMarcador24.setNome("Assalto");
		tipoMarcador24.setGrupoTipoMarcador(td6);
		
		TipoMarcador tipoMarcador25 = new TipoMarcador();
		tipoMarcador25.setId(25);
		tipoMarcador25.setNome("Roubo");
		tipoMarcador25.setGrupoTipoMarcador(td6);
		
		TipoMarcador tipoMarcador26 = new TipoMarcador();
		tipoMarcador26.setId(26);
		tipoMarcador26.setNome("Vandalismo");
		tipoMarcador26.setGrupoTipoMarcador(td6);
		
		TipoMarcador tipoMarcador27 = new TipoMarcador();
		tipoMarcador27.setId(27);
		tipoMarcador27.setNome("Estupro");
		tipoMarcador27.setGrupoTipoMarcador(td6);
		
		TipoMarcador tipoMarcador28 = new TipoMarcador();
		tipoMarcador28.setId(28);
		tipoMarcador28.setNome("Violência contra mulher, criança, idoso");
		tipoMarcador28.setGrupoTipoMarcador(td6);
		
		TipoMarcador tipoMarcador29 = new TipoMarcador();
		tipoMarcador29.setId(29);
		tipoMarcador29.setNome("Gangs");
		tipoMarcador29.setGrupoTipoMarcador(td6);
		
		TipoMarcador tipoMarcador30 = new TipoMarcador();
		tipoMarcador30.setId(30);
		tipoMarcador30.setNome("Traficantes");
		tipoMarcador30.setGrupoTipoMarcador(td6);
		
		TipoMarcador tipoMarcador31 = new TipoMarcador();
		tipoMarcador31.setId(31);
		tipoMarcador31.setNome("Usuários de drogas ilícitas");
		tipoMarcador31.setGrupoTipoMarcador(td6);
		
		
		tiposMarcadores6.add(tipoMarcador24);
		tiposMarcadores6.add(tipoMarcador25);
		tiposMarcadores6.add(tipoMarcador26);
		tiposMarcadores6.add(tipoMarcador27);
		tiposMarcadores6.add(tipoMarcador28);
		tiposMarcadores6.add(tipoMarcador29);
		tiposMarcadores6.add(tipoMarcador30);
		tiposMarcadores6.add(tipoMarcador31);

		td6.setTiposMarcadores(tiposMarcadores6);
		
		tiposDimensoes2.add(td6);
		
		
		
		
		GrupoTipoMarcador td7 = new GrupoTipoMarcador();
		td7.setId(7);
		td7.setNome("Educação");
		td7.setMarcador(marcador2);
		
		List<TipoMarcador> tiposMarcadores7 = new ArrayList<TipoMarcador>();
		
		TipoMarcador tipoMarcador32 = new TipoMarcador();
		tipoMarcador32.setId(32);
		tipoMarcador32.setNome("Escola sem professor");
		tipoMarcador32.setGrupoTipoMarcador(td7);
		
		TipoMarcador tipoMarcador33 = new TipoMarcador();
		tipoMarcador33.setId(33);
		tipoMarcador33.setNome("Escola com problemas estruturais");
		tipoMarcador33.setGrupoTipoMarcador(td6);
		
		TipoMarcador tipoMarcador34 = new TipoMarcador();
		tipoMarcador34.setId(34);
		tipoMarcador34.setNome("Falta de creche");
		tipoMarcador34.setGrupoTipoMarcador(td7);
		
		TipoMarcador tipoMarcador35 = new TipoMarcador();
		tipoMarcador35.setId(35);
		tipoMarcador35.setNome("Falta de escola de ensino fundamental");
		tipoMarcador35.setGrupoTipoMarcador(td7);
		
		TipoMarcador tipoMarcador36 = new TipoMarcador();
		tipoMarcador36.setId(36);
		tipoMarcador36.setNome("Falta de escola de ensino médio");
		tipoMarcador36.setGrupoTipoMarcador(td7);
		
		TipoMarcador tipoMarcador37 = new TipoMarcador();
		tipoMarcador37.setId(37);
		tipoMarcador37.setNome("Falta de faculdade ou universidade");
		tipoMarcador37.setGrupoTipoMarcador(td7);
		
		
		tiposMarcadores7.add(tipoMarcador32);
		tiposMarcadores7.add(tipoMarcador33);
		tiposMarcadores7.add(tipoMarcador34);
		tiposMarcadores7.add(tipoMarcador35);
		tiposMarcadores7.add(tipoMarcador36);
		tiposMarcadores7.add(tipoMarcador37);
		td7.setTiposMarcadores(tiposMarcadores7);
		
		tiposDimensoes2.add(td7);
		
		
		GrupoTipoMarcador td8 = new GrupoTipoMarcador();
		td8.setId(8);
		td8.setMarcador(marcador2);
		td8.setNome("Saúde");
		
		
		List<TipoMarcador> tiposMarcadores8 = new ArrayList<TipoMarcador>();
		
		TipoMarcador tipoMarcador38 = new TipoMarcador();
		tipoMarcador38.setId(38);
		tipoMarcador38.setNome("Falta de posto de saúde");
		tipoMarcador38.setGrupoTipoMarcador(td8);
		
		TipoMarcador tipoMarcador39 = new TipoMarcador();
		tipoMarcador39.setId(39);
		tipoMarcador39.setNome("Falta de hospital");
		tipoMarcador39.setGrupoTipoMarcador(td8);
		
		TipoMarcador tipoMarcador40 = new TipoMarcador();
		tipoMarcador40.setId(40);
		tipoMarcador40.setNome("Falta de médico");
		tipoMarcador40.setGrupoTipoMarcador(td8);
		
		TipoMarcador tipoMarcador41 = new TipoMarcador();
		tipoMarcador41.setId(41);
		tipoMarcador41.setNome("Falta de medicamento");
		tipoMarcador41.setGrupoTipoMarcador(td8);
		
		TipoMarcador tipoMarcador42 = new TipoMarcador();
		tipoMarcador42.setId(42);
		tipoMarcador42.setNome("Superlotação");
		tipoMarcador42.setGrupoTipoMarcador(td8);
		
		TipoMarcador tipoMarcador43 = new TipoMarcador();
		tipoMarcador43.setId(43);
		tipoMarcador43.setNome("Atendimento ruim");
		tipoMarcador43.setGrupoTipoMarcador(td8);
		
		TipoMarcador tipoMarcador44 = new TipoMarcador();
		tipoMarcador44.setId(44);
		tipoMarcador44.setNome("Falta de leito");
		tipoMarcador44.setGrupoTipoMarcador(td8);
		
		TipoMarcador tipoMarcador45 = new TipoMarcador();
		tipoMarcador45.setId(45);
		tipoMarcador45.setNome("Falta de equipamentos");
		tipoMarcador45.setGrupoTipoMarcador(td8);
		
		
		tiposMarcadores8.add(tipoMarcador38);
		tiposMarcadores8.add(tipoMarcador39);
		tiposMarcadores8.add(tipoMarcador40);
		tiposMarcadores8.add(tipoMarcador41);
		tiposMarcadores8.add(tipoMarcador42);
		tiposMarcadores8.add(tipoMarcador43);
		tiposMarcadores8.add(tipoMarcador44);
		tiposMarcadores8.add(tipoMarcador45);
		td8.setTiposMarcadores(tiposMarcadores8);
		
		tiposDimensoes2.add(td8);
		
		GrupoTipoMarcador td9 = new GrupoTipoMarcador();
		td9.setId(9);
		td9.setMarcador(marcador2);
		td9.setNome("Infraestrutura Urbana");
		
		List<TipoMarcador> tiposMarcadores9 = new ArrayList<TipoMarcador>();
		
		TipoMarcador tipoMarcador46 = new TipoMarcador();
		tipoMarcador46.setId(46);
		tipoMarcador46.setNome("Iluminação pública deficiente, inexistente");
		tipoMarcador46.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador47 = new TipoMarcador();
		tipoMarcador47.setId(47);
		tipoMarcador47.setNome("Pavimentação pública deficiente, inexistente");
		tipoMarcador47.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador48 = new TipoMarcador();
		tipoMarcador48.setId(48);
		tipoMarcador48.setNome("Rede de coleta de esgoto inexistente");
		tipoMarcador48.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador49 = new TipoMarcador();
		tipoMarcador49.setId(49);
		tipoMarcador49.setNome("Abastecimento de água insuficiente, inexistente");
		tipoMarcador49.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador50 = new TipoMarcador();
		tipoMarcador50.setId(50);
		tipoMarcador50.setNome("Atendimento de energia elétrica insatisfatório, inexistente");
		tipoMarcador50.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador51 = new TipoMarcador();
		tipoMarcador51.setId(51);
		tipoMarcador51.setNome("Ponto de alagamento, inundação ou enchente");
		tipoMarcador51.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador52 = new TipoMarcador();
		tipoMarcador52.setId(52);
		tipoMarcador52.setNome("Ponto de congestionamento");
		tipoMarcador52.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador53 = new TipoMarcador();
		tipoMarcador53.setId(53);
		tipoMarcador53.setNome("Acidentes envolvendo veículos, motos, ciclistas, pedestres");
		tipoMarcador53.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador54 = new TipoMarcador();
		tipoMarcador54.setId(54);
		tipoMarcador54.setNome("Buracos/erosões em vias públicas");
		tipoMarcador54.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador55 = new TipoMarcador();
		tipoMarcador55.setId(55);
		tipoMarcador55.setNome("Inexistência de bueiros (galerias de água pluvial)");
		tipoMarcador55.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador56 = new TipoMarcador();
		tipoMarcador56.setId(56);
		tipoMarcador56.setNome("Drenagem inadequada de águas pluviais");
		tipoMarcador56.setGrupoTipoMarcador(td9);
		
		TipoMarcador tipoMarcador57 = new TipoMarcador();
		tipoMarcador57.setId(57);
		tipoMarcador57.setNome("Ponto de estrangulamento irregular de drenagem fluvial (represa/barragem clandestina)");
		tipoMarcador57.setGrupoTipoMarcador(td9);
		
		
		tiposMarcadores9.add(tipoMarcador46);
		tiposMarcadores9.add(tipoMarcador47);
		tiposMarcadores9.add(tipoMarcador48);
		tiposMarcadores9.add(tipoMarcador49);
		tiposMarcadores9.add(tipoMarcador50);
		tiposMarcadores9.add(tipoMarcador51);
		tiposMarcadores9.add(tipoMarcador52);
		tiposMarcadores9.add(tipoMarcador53);
		tiposMarcadores9.add(tipoMarcador54);
		tiposMarcadores9.add(tipoMarcador55);
		tiposMarcadores9.add(tipoMarcador56);
		tiposMarcadores9.add(tipoMarcador57);
		
		td9.setTiposMarcadores(tiposMarcadores9);
		tiposDimensoes2.add(td9);
		
		
		GrupoTipoMarcador td10 = new GrupoTipoMarcador();
		td10.setId(10);
		td10.setNome("Invasão");
		td10.setMarcador(marcador2);
		tiposDimensoes2.add(td10);
		
		List<TipoMarcador> tiposMarcadores10 = new ArrayList<TipoMarcador>();
		
		TipoMarcador tipoMarcador58 = new TipoMarcador();
		tipoMarcador58.setId(58);
		tipoMarcador58.setNome("Invasão de patrimônio público");
		tipoMarcador58.setGrupoTipoMarcador(td10);
		
		TipoMarcador tipoMarcador59 = new TipoMarcador();
		tipoMarcador59.setId(59);
		tipoMarcador59.setNome("Invasão de terreno público");
		tipoMarcador59.setGrupoTipoMarcador(td10);
		
		
		tiposMarcadores10.add(tipoMarcador58);
		tiposMarcadores10.add(tipoMarcador59);
		
		td10.setTiposMarcadores(tiposMarcadores10);
		
		
		
		marcador1.setListaGrupoTipoMarcador(tiposDimensoes1);
		marcador2.setListaGrupoTipoMarcador(tiposDimensoes2);
		
		marcador1 = entityManager.merge(marcador1);
		marcador2 = entityManager.merge(marcador2);
		
		entityManager.persist(marcador1);
		entityManager.persist(marcador2);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
