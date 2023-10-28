describe('Ajax Poll', function() {
	
	beforeEach(() => {
		cy.visit('http://localhost:8080/primefaces-test/ajax_poll.jsf')
	})
	
    it('Verifica o título da aplicação', function() {
        cy.title().should('be.equal', 'PrimeFaces Test')
    })
	
})