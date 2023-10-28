describe('DataTable', function() {
	
	beforeEach(() => {
		cy.visit('http://localhost:8080/primefaces-test/datatable.jsf')
	})
	
    it('Verifica o título da aplicação', function() {
        cy.title().should('be.equal', 'PrimeFaces Test')
    })
	
})