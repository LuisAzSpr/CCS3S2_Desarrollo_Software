require "Lista"
require "Producto"

describe Lista do
	describe ".agregar" do

		context "Se inicializa lista" do
			it "la cantidad debe ser igual a 0" do
				expect(@lista.cantidad).to eq(0)
			end
		end

		before do
			@producto = Producto.new("Jamon",9)
			@lista = Lista.new
		end

		context "Se agrega producto" do
			it "cantidad aumenta en 1 y se agrega producto" do
				@lista.agregar(@producto)
				expect(@lista.cantidad).to eq(1)
				expect(@lista.productos).to include(@producto)
			end
		end

	end
end