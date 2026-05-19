import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new java.util.ArrayList<>();
        List<Pessoa_Fisica> clientesPF = new java.util.ArrayList<>();
        List<Pessoa_Juridica> clientesPJ = new java.util.ArrayList<>();
        List<Moto> motos = new java.util.ArrayList<>();

        System.out.println("Bem-vindo ao sistema de concessionária!");
        System.out.println("\nSelecione a opção desejada:");
        System.out.println("\n1 - Cadastrar Veiculo");
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
                System.out.println("Qual veiculo deseja cadastrar?");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                int opcaoVeiculo = scanner.nextInt();
                if (opcaoVeiculo == 1) {
                    System.out.println("Digite a marca:");
                    String marca = scanner.next();

                    System.out.println("Digite o modelo:");
                    String modelo = scanner.next();

                    System.out.println("Digite a placa:");
                    String placa = scanner.next();

                    System.out.println("Digite o ano:");
                    int ano = scanner.nextInt();

                    carros.add(new Carro(marca, modelo, placa, ano));
                    System.out.println("Carro cadastrado com sucesso!");

                } else if (opcaoVeiculo == 2) {
                    System.out.println("Digite a marca:");
                    String marca = scanner.next();

                    System.out.println("Digite o modelo:");
                    String modelo = scanner.next();

                    System.out.println("Digite a placa:");
                    String placa = scanner.next();

                    System.out.println("Digite o ano:");
                    int ano = scanner.nextInt();

                    motos.add(new Moto(marca, modelo, placa, ano));
                    System.out.println("Moto cadastrada com sucesso!");
                } else {
                    System.out.println("Opção inválida!");
                }
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

                        System.out.println("Digite a data de nascimento:");
                        String dataNascimento = scanner.next();

                        clientesPF.add(new Pessoa_Fisica(nome, cpf, dataNascimento));
                        System.out.println("Cliente Pessoa Física cadastrado com sucesso!");

                    } else if (opcaoCliente == 2) {
                        System.out.println("Digite o nome:");
                        String nome = scanner.next();

                        System.out.println("Digite o CNPJ:");
                        String cnpj = scanner.next();

                        System.out.println("Digite a inscrição estadual:");
                        String inscricaoEstadual = scanner.next();

                        clientesPJ.add(new Pessoa_Juridica(nome, cnpj, inscricaoEstadual));
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
                                System.out.println("Digite a nova marca:");
                                carro.setMarca(scanner.next());
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
                                System.out.println("Digite a nova marca:");
                                moto.setMarca(scanner.next());
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
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.out.println("Qual tipo de veiculo deseja listar?");
                System.out.println("1 - Carro");
                System.out.println("2 - Moto");
                int opcaoListar = scanner.nextInt();
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
                System.out.println("Digite uma opção válida para listar os veículos.");
                opcaoListar = scanner.nextInt();
                break;
            case 8:
                System.out.println("Qual tipo de cliente deseja listar?");
                System.out.println("1 - Pessoa Física");
                System.out.println("2 - Pessoa Jurídica");
                int opcaoListarClientes = scanner.nextInt();
                if (opcaoListarClientes == 1) {
                    for (Pessoa_Fisica pf : clientesPF) {
                        System.out.println(pf);
                    }
                } else if (opcaoListarClientes == 2) {
                    for (Pessoa_Juridica pj : clientesPJ) {
                        System.out.println(pj);
                    }
                }
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
