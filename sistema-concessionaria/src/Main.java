import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        List<Pessoa_Fisica> clientesPF = new ArrayList<>();
        List<Pessoa_Juridica> clientesPJ = new ArrayList<>();
        List<Moto> motos = new ArrayList<>();
        List<String> vendas = new ArrayList<>();
        boolean rodando = true;

        System.out.println("Bem-vindo ao sistema de concessionária!");

        do {
            System.out.println("\nSelecione a opção desejada:");
            System.out.println("1 - Cadastrar Veiculo");
            System.out.println("2 - Cadastrar Cliente (Pessoa Física / Pessoa Jurídica)");
            System.out.println("3 - Editar Veiculo");
            System.out.println("4 - Editar Cliente");
            System.out.println("5 - Deletar Veiculo");
            System.out.println("6 - Deletar Cliente");
            System.out.println("7 - Listar Veiculos");
            System.out.println("8 - Listar Clientes");
            System.out.println("9 - Realizar Venda");
            System.out.println("10 - Ver Historico de vendas");
            System.out.println("11 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int opcaoVeiculo;
                    do {
                        System.out.println("Qual veiculo deseja cadastrar?");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        opcaoVeiculo = scanner.nextInt();
                        if (opcaoVeiculo == 1) {
                            System.out.println("Digite o fabricante:");
                            String fabricante = scanner.next();
                            System.out.println("Digite o modelo:");
                            String modelo = scanner.next();
                            System.out.println("Digite a placa:");
                            String placa = scanner.next();
                            System.out.println("Digite o ano:");
                            int ano = scanner.nextInt();
                            carros.add(new Carro(fabricante, modelo, placa, ano));
                            System.out.println("Carro cadastrado com sucesso!");
                        } else if (opcaoVeiculo == 2) {
                            System.out.println("Digite o fabricante:");
                            String fabricante = scanner.next();
                            System.out.println("Digite o modelo:");
                            String modelo = scanner.next();
                            System.out.println("Digite a placa:");
                            String placa = scanner.next();
                            System.out.println("Digite o ano:");
                            int ano = scanner.nextInt();
                            motos.add(new Moto(fabricante, modelo, placa, ano));
                            System.out.println("Moto cadastrada com sucesso!");
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    } while (opcaoVeiculo != 1 && opcaoVeiculo != 2);
                    break;

                case 2:
                    int opcaoCliente;
                    do {
                        System.out.println("Qual cliente deseja cadastrar?");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        opcaoCliente = scanner.nextInt();
                        if (opcaoCliente == 1) {
                            System.out.println("Digite o nome:");
                            String nome = scanner.next();
                            System.out.println("Digite o CPF:");
                            String cpf = scanner.next();
                            System.out.println("Digite seu contato:");
                            String contato = scanner.next();
                            clientesPF.add(new Pessoa_Fisica(nome, cpf, contato));
                            System.out.println("Cliente Pessoa Física cadastrado com sucesso!");
                        } else if (opcaoCliente == 2) {
                            System.out.println("Digite o nome:");
                            String nome = scanner.next();
                            System.out.println("Digite o CNPJ:");
                            String cnpj = scanner.next();
                            System.out.println("Digite seu contato:");
                            String contato = scanner.next();
                            clientesPJ.add(new Pessoa_Juridica(nome, cnpj, contato));
                            System.out.println("Cliente Pessoa Jurídica cadastrado com sucesso!");
                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcaoCliente != 1 && opcaoCliente != 2);
                    break;

                case 3:
                    int opcaoEditarVeiculo;
                    do {
                        System.out.println("Qual veiculo deseja editar?");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        opcaoEditarVeiculo = scanner.nextInt();
                        if (opcaoEditarVeiculo == 1) {
                            System.out.println("Digite a placa do carro que deseja editar:");
                            String placaEditar = scanner.next();
                            boolean encontrado = false;
                            for (Carro carro : carros) {
                                if (carro.getPlaca().equals(placaEditar)) {
                                    System.out.println("Digite o novo fabricante:");
                                    carro.setFabricante(scanner.next());
                                    System.out.println("Digite o novo modelo:");
                                    carro.setModelo(scanner.next());
                                    System.out.println("Digite o novo ano:");
                                    carro.setAno(scanner.nextInt());
                                    System.out.println("Carro editado com sucesso!");
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado)
                                System.out.println("Veículo não encontrado!");
                        } else if (opcaoEditarVeiculo == 2) {
                            System.out.println("Digite a placa da moto que deseja editar:");
                            String placaEditar = scanner.next();
                            boolean encontrado = false;
                            for (Moto moto : motos) {
                                if (moto.getPlaca().equals(placaEditar)) {
                                    System.out.println("Digite o novo fabricante:");
                                    moto.setFabricante(scanner.next());
                                    System.out.println("Digite o novo modelo:");
                                    moto.setModelo(scanner.next());
                                    System.out.println("Digite o novo ano:");
                                    moto.setAno(scanner.nextInt());
                                    System.out.println("Moto editada com sucesso!");
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado)
                                System.out.println("Veículo não encontrado!");
                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcaoEditarVeiculo != 1 && opcaoEditarVeiculo != 2);
                    break;

                case 4:
                    int opcaoEditarCliente;
                    do {
                        System.out.println("Qual cliente deseja editar?");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        opcaoEditarCliente = scanner.nextInt();
                        if (opcaoEditarCliente == 1) {
                            System.out.println("Digite o CPF do cliente que deseja editar:");
                            String cpfEditar = scanner.next();
                            boolean encontrado = false;
                            for (Pessoa_Fisica pf : clientesPF) {
                                if (pf.getCpf().equals(cpfEditar)) {
                                    System.out.println("Digite o novo nome:");
                                    pf.setNome(scanner.next());
                                    System.out.println("Digite o novo contato:");
                                    pf.setContato(scanner.next());
                                    System.out.println("Cliente editado com sucesso!");
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado)
                                System.out.println("Cliente não encontrado!");
                        } else if (opcaoEditarCliente == 2) {
                            System.out.println("Digite o CNPJ do cliente que deseja editar:");
                            String cnpjEditar = scanner.next();
                            boolean encontrado = false;
                            for (Pessoa_Juridica pj : clientesPJ) {
                                if (pj.getCnpj().equals(cnpjEditar)) {
                                    System.out.println("Digite o novo nome:");
                                    pj.setNome(scanner.next());
                                    System.out.println("Digite o novo contato:");
                                    pj.setContato(scanner.next());
                                    System.out.println("Cliente editado com sucesso!");
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (!encontrado)
                                System.out.println("Cliente não encontrado!");
                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcaoEditarCliente != 1 && opcaoEditarCliente != 2);
                    break;
                case 5:
                    int opcaoDeletarVeiculo;
                    do {
                        System.out.println("Qual tipo de veiculo deseja deletar?");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        opcaoDeletarVeiculo = scanner.nextInt();
                        if (opcaoDeletarVeiculo == 1) {
                            System.out.println("Digite a placa do carro que deseja deletar:");
                            String placaDeletar = scanner.next();
                            boolean removido = carros.removeIf(c -> c.getPlaca().equals(placaDeletar));
                            if (removido)
                                System.out.println("Carro deletado com sucesso!");
                            else
                                System.out.println("Veículo não encontrado!");
                        } else if (opcaoDeletarVeiculo == 2) {
                            System.out.println("Digite a placa da moto que deseja deletar:");
                            String placaDeletar = scanner.next();
                            boolean removido = motos.removeIf(m -> m.getPlaca().equals(placaDeletar));
                            if (removido)
                                System.out.println("Moto deletada com sucesso!");
                            else
                                System.out.println("Veículo não encontrado!");
                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcaoDeletarVeiculo != 1 && opcaoDeletarVeiculo != 2);
                    break;

                case 6:
                    int opcaoDeletarCliente;
                    do {
                        System.out.println("Qual tipo de cliente deseja deletar?");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        opcaoDeletarCliente = scanner.nextInt();

                        if (opcaoDeletarCliente == 1) {
                            System.out.println("Digite o CPF do cliente que deseja deletar:");
                            String cpfDeletar = scanner.next();

                            boolean removido = clientesPF.removeIf(pf -> pf.getCpf().equals(cpfDeletar));

                            if (removido)
                                System.out.println("Cliente Pessoa Física deletado com sucesso!");
                            else
                                System.out.println("Cliente não encontrado!");

                        } else if (opcaoDeletarCliente == 2) {
                            System.out.println("Digite o CNPJ do cliente que deseja deletar:");
                            String cnpjDeletar = scanner.next();

                            boolean removido = clientesPJ.removeIf(pj -> pj.getCnpj().equals(cnpjDeletar));

                            if (removido)
                                System.out.println("Cliente Pessoa Jurídica deletado com sucesso!");
                            else
                                System.out.println("Cliente não encontrado!");

                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcaoDeletarCliente != 1 && opcaoDeletarCliente != 2);
                    break;
                case 7:
                    int opcaoListar;
                    do {
                        System.out.println("Qual tipo de veiculo deseja listar?");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        opcaoListar = scanner.nextInt();
                        if (opcaoListar == 1) {
                            for (Carro carro : carros) {
                                System.out.println(carro);
                            }
                        } else if (opcaoListar == 2) {
                            for (Moto moto : motos) {
                                System.out.println(moto);
                            }
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    } while (opcaoListar != 1 && opcaoListar != 2);
                    break;

                case 8:
                    int opcaoListarClientes;
                    do {
                        System.out.println("Qual tipo de cliente deseja listar?");
                        System.out.println("1 - Pessoa Física");
                        System.out.println("2 - Pessoa Jurídica");
                        opcaoListarClientes = scanner.nextInt();
                        if (opcaoListarClientes == 1) {
                            for (Pessoa_Fisica pf : clientesPF) {
                                System.out.println(pf);
                            }
                        } else if (opcaoListarClientes == 2) {
                            for (Pessoa_Juridica pj : clientesPJ) {
                                System.out.println(pj);
                            }
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    } while (opcaoListarClientes != 1 && opcaoListarClientes != 2);
                    break;

                case 9:
                    int opcaoVender;
                    do {
                        System.out.println("Qual tipo de veiculo deseja vender?");
                        System.out.println("1 - Carro");
                        System.out.println("2 - Moto");
                        opcaoVender = scanner.nextInt();

                        if (opcaoVender == 1) {
                            System.out.println("Digite a placa do carro que deseja vender:");
                            String placa = scanner.next();
                            Carro vendido = carros.stream()
                                    .filter(c -> c.getPlaca().equals(placa))
                                    .findFirst().orElse(null);

                            if (vendido == null) {
                                System.out.println("Carro não encontrado.");
                            } else {
                                System.out.println("Tipo do cliente comprador?");
                                System.out.println("1 - Pessoa Física");
                                System.out.println("2 - Pessoa Jurídica");
                                int tipoCliente = scanner.nextInt();
                                Cliente comprador = null;

                                if (tipoCliente == 1) {
                                    System.out.println("Digite o CPF do comprador:");
                                    String cpf = scanner.next();
                                    comprador = clientesPF.stream()
                                            .filter(pf -> pf.getCpf().equals(cpf))
                                            .findFirst().orElse(null);
                                } else if (tipoCliente == 2) {
                                    System.out.println("Digite o CNPJ do comprador:");
                                    String cnpj = scanner.next();
                                    comprador = clientesPJ.stream()
                                            .filter(pj -> pj.getCnpj().equals(cnpj))
                                            .findFirst().orElse(null);
                                }

                                if (comprador == null) {
                                    System.out.println("Cliente não encontrado. Venda cancelada.");
                                } else {
                                    vendas.add("Carro: " + vendido + " | Comprador: " + comprador.getNome());
                                    carros.remove(vendido);
                                    System.out.println("Carro vendido com sucesso para " + comprador.getNome() + "!");
                                }
                            }

                        } else if (opcaoVender == 2) {
                            System.out.println("Digite a placa da moto que deseja vender:");
                            String placa = scanner.next();
                            Moto vendida = motos.stream()
                                    .filter(m -> m.getPlaca().equals(placa))
                                    .findFirst().orElse(null);

                            if (vendida == null) {
                                System.out.println("Moto não encontrada.");
                            } else {
                                System.out.println("Tipo do cliente comprador?");
                                System.out.println("1 - Pessoa Física");
                                System.out.println("2 - Pessoa Jurídica");
                                int tipoCliente = scanner.nextInt();
                                Cliente comprador = null;

                                if (tipoCliente == 1) {
                                    System.out.println("Digite o CPF do comprador:");
                                    String cpf = scanner.next();
                                    comprador = clientesPF.stream()
                                            .filter(pf -> pf.getCpf().equals(cpf))
                                            .findFirst().orElse(null);
                                } else if (tipoCliente == 2) {
                                    System.out.println("Digite o CNPJ do comprador:");
                                    String cnpj = scanner.next();
                                    comprador = clientesPJ.stream()
                                            .filter(pj -> pj.getCnpj().equals(cnpj))
                                            .findFirst().orElse(null);
                                }

                                if (comprador == null) {
                                    System.out.println("Cliente não encontrado. Venda cancelada.");
                                } else {
                                    vendas.add("Moto: " + vendida + " | Comprador: " + comprador.getNome());
                                    motos.remove(vendida);
                                    System.out.println("Moto vendida com sucesso para " + comprador.getNome() + "!");
                                }
                            }

                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcaoVender != 1 && opcaoVender != 2);
                    break;
                case 10:
                    System.out.println("Historico de vendas:");
                    if (vendas.isEmpty()) {
                        System.out.println("Nenhuma venda realizada.");
                    } else {
                        for (String venda : vendas) {
                            System.out.println(venda);
                        }
                    }
                    break;

                case 11:
                    int opcaoSair;
                    do {
                        System.out.println("Deseja sair do sistema?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        opcaoSair = scanner.nextInt();
                    } while (opcaoSair != 1 && opcaoSair != 2);
                    if (opcaoSair == 1) {
                        System.out.println("Saindo do sistema...");
                        rodando = false;
                    } else {
                        System.out.println("Voltando ao menu principal...");
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (rodando);

        scanner.close();
    }
}