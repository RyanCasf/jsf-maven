describe('Test', function() {
	
	beforeEach(() => {
		cy.visit('http://localhost:8080/primefaces-test/test.jsf')
	})
	
    it('Verifica o título da aplicação', function() {
        cy.title().should('be.equal', 'PrimeFaces Test')
    })
	
})