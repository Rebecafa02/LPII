class PilhaDinamica(var tamanho: Int = 10): Empilhavel {
    private var ponteiroTopo: NoDuplo? = null
    private var quantidade = 0

    override fun empilhar(dado: Any?) {
        TODO("Not yet implemented")
    }

    override fun desempilhar(): Any? {
        TODO("Not yet implemented")
    }

    override fun topo(): Any? {
        TODO("Not yet implemented")
    }

    override fun estaCheia(): Boolean {
        return (quantidade == tamanho)
    }

    override fun estaVazia(): Boolean {
        return (quantidade == 0)
    }

    override fun imprimir(): String {
        var ponteiroAuxiliar = ponteiroTopo
        var resultado = "["
        for(i in 0 .. quantidade-1){
            if (i == quantidade-1){
                resultado += "{$ponteiroAuxiliar?.dado}"
            } else{
                resultado += "{$ponteiroAuxiliar?.dado},"
            }
        }
        return "$resultado]"
    }
}